grammar Lark;

options {
    language = Java;
}

@header {
import java.util.*;

import lombok.Getter;

import io.mathlark.larkv2.expressions.*;
import io.mathlark.larkv2.expressions.math.*;
import io.mathlark.larkv2.symbols.*;

}

@members {

class MapEntry {
    private @Getter IExpression key;
    private @Getter IExpression value;

    public MapEntry(IExpression key, IExpression value) {
        this.key = key;
        this.value = value;
    }
}

}

        
evaluator returns [IExpression exprObject]
    : expr EOF { $exprObject = $expr.exprObject; }
    ;

actualParams returns [List<IExpression> exprs]
    :   { $exprs = new ArrayList<>(); } expr { $exprs.add($expr.exprObject); } 
        (',' expr { $exprs.add($expr.exprObject); })*
    ;

term returns [IExpression exprObject]
    : IDENTIFIER { $exprObject = SymbolTables.evaluate($IDENTIFIER.text); }
    | '(' expr ')' { $exprObject = $expr.exprObject; }
    | INTEGER { $exprObject = new NumericExpression(Long.parseLong($INTEGER.text)); }
    | DECIMAL { $exprObject = new NumericExpression(Double.parseDouble($DECIMAL.text)); }
    | STRING { $exprObject = new StringExpression($STRING.text); }
    | BOOLEAN { 
        String b = $BOOLEAN.text;
        $exprObject = b.equals("True") ? GlobalSymbols.TRUE : GlobalSymbols.FALSE;
     }
    | CHARACTER { $exprObject = new StringExpression($CHARACTER.text); }
    | IDENTIFIER '(' actualParams? ')' { 
        if ($actualParams.text != null) {
            $exprObject = new FunctionCallExpression($IDENTIFIER.text, $actualParams.exprs); 
        }
        else {
            $exprObject = new FunctionCallExpression($IDENTIFIER.text, List.of());
        }
    }
    | '[' actualParams? ']' {
        if ($actualParams.text != null) {
            $exprObject = new ListExpression($actualParams.exprs);
        }
        else {
            $exprObject = new ListExpression(List.of());
        }
    } 
    | '{' mapEntries '}' {
        $exprObject = new DictExpression($mapEntries.map);
    }       
    ;

mapEntries returns [Map<IExpression, IExpression> map]
    :   { $map = new HashMap<>(); }
        mapExpr? { 
        if ($mapExpr.text != null) {
            $map.put($mapExpr.entry.getKey(), $mapExpr.entry.getValue());
        }
    }
    (',' mapExpr? {
        if ($mapExpr.text != null) {
            $map.put($mapExpr.entry.getKey(), $mapExpr.entry.getValue());
        }
    })*
    ;

mapExpr returns [MapEntry entry]
    : key=expr ':' value=expr {
        $entry = new MapEntry($key.exprObject, $value.exprObject);
    }
    ;

assign
    : id=IDENTIFIER ':=' expr { 
        SymbolTables.addLocal($id.text, $expr.exprObject);
    }
    ;

returnStmt: 'return' expr ';';

functionAnonDef
    : '<' IDENTIFIER '>'
    ;

unary returns [IExpression exprObject]
    :   { boolean positive = true; }
        ('+' | '-' { positive = !positive; })* term
        { 
            $exprObject = $term.exprObject; 
            if (!positive) {
                $exprObject = $term.exprObject.negate();
            }
        }
    ;

exponent returns [IExpression exprObject]
    :   op1=unary { $exprObject = $op1.exprObject; } 
        ('^' op2=unary { $exprObject = $exprObject.pow($op2.exprObject); })* 
    ;

multiply returns [IExpression exprObject]
    :   op1=exponent { $exprObject = $op1.exprObject; }  
        (
            '*'  op2=exponent { $exprObject = $exprObject.mul($op2.exprObject); }
            | '/'  op2=exponent { $exprObject = $exprObject.div($op2.exprObject); }
            | '%'  op2=exponent { $exprObject = $exprObject.mod($op2.exprObject); }
        )*
    ;

expr returns [IExpression exprObject]
    :   op1=multiply { $exprObject = $op1.exprObject; }
        ('+' op2=multiply { $exprObject = $exprObject.add($op2.exprObject); }
        | '-' op2=multiply { $exprObject = $exprObject.sub($op2.exprObject); })*
    |   assign
    ;

INTEGER: DIGIT+;
DECIMAL: DIGIT+ '.' DIGIT+;

STRING
    :   '"' 
        ~('\n' | '\r')*
        '"'
        { setText(getText().substring(1, getText().length() - 1)); }
    ;

CHARACTER
    : '\'' . '\'' { setText(getText().substring(1, 2));  }
    ;

BOOLEAN: 'True' | 'False';
UNDEFINED: 'Undefined';

fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];

// NEWLINE: '\n';

IDENTIFIER: LETTER (LETTER | DIGIT)* ;

WS: [ \t\n\r\f]+ -> channel(HIDDEN);