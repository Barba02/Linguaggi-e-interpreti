grammar IntExp;

main: init exp EOF;

init : (ID EQU exp SEMI)*    # initialize;
exp : ID                            # id
    | NUM                           # number
    | LPAR exp RPAR                 # subExp
    | <assoc=right> exp CAR exp     # power
    | exp op=(MUL | DIV | MOD) exp  # mulDivMod
    | exp op=(ADD | SUB) exp        # addSub;

LPAR: '(';
RPAR: ')';
SEMI: ';';
EQU : '=';
CAR : '^';
MUL : '*';
DIV : '/';
MOD : 'mod';
ADD : '+';
SUB : '-';

ID  : [a-z]+;

NUM : INT | FLOAT;
INT          : NAT | '-' POS;
fragment NAT : '0' | POS;
fragment POS : [1-9][0-9]*;
FLOAT             : INT | (INT | '-' '0') '.' DIGIT+;
fragment DIGIT    : '0' | POSDIGIT;
fragment POSDIGIT : [1-9];

WS  : [ \t\n\r]+ -> skip;
