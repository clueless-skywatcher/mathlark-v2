grammar LarkFile;

options {
    language = Java;
}

lkFile
    : (expr ';' | functionDef)* EOF
    ;

codeBlock
    : '{' (expr ';' | functionDef)* returnStmt? '}'
    ;

functionDefs[String funcName]
    : '(' (args+=IDENTIFIER (',' args+=IDENTIFIER)*)? ')' ':=' codeBlock
    ;

functionDef
    : '<' IDENTIFIER '>' ':=' '{' functionDefs[$IDENTIFIER.text]+ '}'
    ;

actualParams
    :   expr(',' expr)*
    ;

term
    : IDENTIFIER #Variable
    | '(' expr ')' #Parenthesis
    | INTEGER #Integer
    | DECIMAL #Decimal
    | STRING #String
    | UNDEFINED #Undefined
    | BOOLEAN #Boolean
    | CHARACTER #Character
    | IDENTIFIER '(' actualParams? ')' #FunctionCall
    | '[' actualParams? ']' #ListExpr
    | '{' mapEntries '}' #DictExpr
    ;

mapEntries
    :   mapExpr? (',' mapExpr?)*
    ;

mapExpr
    : key=expr ':' value=expr
    ;

assign
    : id=IDENTIFIER ':=' expr
    ;

returnStmt: RETURN expr ';';

functionAnonDef
    :   '<' IDENTIFIER '>'
    ;

unary returns [boolean positive]
    : {$positive = true;} ('+' | '-' {$positive = !$positive;})* term
    ;

exponent
    :   op1=unary('^' op2=unary)* 
    ;

multiply
    :   op1=exponent
        (
            op='*'  op2=exponent
            | op='/'  op2=exponent
            | op='%'  op2=exponent
        )*
    ;

expr
    :   iterable=expr '{' key=expr '}'  #Access
    |   op1=multiply
        (op='+' op2=expr
        | op='-' op2=expr)*     #AddOrSub
    |   relop1=expr
        (relop='>' relop2=expr 
        |relop='>=' relop2=expr
        |relop='<' relop2=expr
        |relop='<=' relop2=expr)    #Comparison
    |   assign  #AssignExp
    |   relop1=expr
        (relop='==' relop2=expr
        | relop='!=' relop2=expr)   #EqualityCheck   
    |   functionAnonDef #FunctionAnonDefExp
    |   multiply #Mul
    ;

INTEGER: DIGIT+;
DECIMAL: DIGIT+ '.' DIGIT+;

STRING
    :   '"' 
        ~('"' | '\n' | '\r')*
        '"'
        { setText(getText().substring(1, getText().length() - 1)); }
    ;

CHARACTER
    : '\'' . '\'' { setText(getText().substring(1, 2));  }
    ;

BOOLEAN: 'True' | 'False';
UNDEFINED: 'Undefined';
RETURN: 'Return';

fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];

// NEWLINE: '\n';

IDENTIFIER: LETTER (LETTER | DIGIT)* ;

WS: [ \t\n\r\f]+ -> channel(HIDDEN);