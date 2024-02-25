grammar Lark;

options {
    language = Java;
}

@header {
import java.util.*;
}

        
prog
    : stmt+
    ;

stmt
    : expr ';'
    | term ';'
    | assign ';'
    | functionDef ';'
    | functionAnonDef ';'
    | functionCall ';'
    ;

functionCall
    : IDENTIFIER '(' actualParams? ')'
    ;

actualParams
    : expr (',' expr)*
    ;

term
    : IDENTIFIER
    | '(' expr ')'
    | INTEGER
    | DECIMAL
    | STRING
    | CHARACTER
    | IDENTIFIER '(' actualParams? ')'
    ;

assign
    : id=IDENTIFIER ':=' expr { 
        System.out.println($id.text); 
        System.out.println($expr.text);
    }
    ;

returnStmt: 'return' expr ';';

functionDef
    : '<' IDENTIFIER '>' ':=' '(' params? ')' '->' '{'(stmt | returnStmt)*'}'
    ;   // <Func> := (a, b, c) -> {
        //  DoThings();
        // }

functionAnonDef
    : '<' IDENTIFIER '>'
    ;

params
    : param (',' param)*
    ;

param
    : IDENTIFIER
    ;


negate
    : '~'* term
    ;

unary
    : ('+' | '-')* negate
    ;

exponent
    : unary ('^' unary)*
    ;

multiply
    : exponent (('*' | '/' | '%') exponent)*
    ;

add
    : multiply (('+' | '-') multiply)*
    ;

relation
    : add (('=' | '!=' | '<' | '<=' | '>=' | '>') add)*
    ;

expr
    : relation (('and' | 'or') relation)*
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
fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];

// NEWLINE: '\n';

IDENTIFIER: LETTER (LETTER | DIGIT)* ;

WS: [ \t\n\r\f]+ -> channel(HIDDEN);