grammar Imp;

main: com EOF;

com: IF LPAR exp RPAR THEN LCURL com RCURL ELSE LCURL com RCURL     # if
   | ID ASSIGN exp                                                  # initVar
   | ID LBRACK exp RBRACK ASSIGN exp                                # initArray
   | SKIPP                                                          # skip
   | com SEMICOLON com                                              # seq
   | WHILE LPAR exp RPAR LCURL com RCURL                            # while
   | OUT LPAR exp RPAR                                              # out;
exp : NAT                               # natural
    | BOOL                              # boolean
    | STRING                            # string
    | LPAR exp RPAR                     # subExp
    | TOSTR LPAR exp RPAR               # toString
    | exp DOT exp                       # concatString
    | <assoc=right> exp POW exp         # power
    | NOT exp                           # not
    | exp op=(MUL | DIV | MOD) exp      # mulDivMod
    | exp op=(ADD | SUB) exp            # addSub
    | exp op=(LT | LEQ | GEQ | GT) exp  # compare
    | exp op=(EQ | NEQ) exp             # equal
    | exp op=(AND | OR) exp             # logic
    | ID                                # id
    | ID LBRACK exp RBRACK              # array;

LPAR      : '(';
RPAR      : ')';
LCURL     : '{';
RCURL     : '}';
LBRACK    : '[';
RBRACK    : ']';
ASSIGN    : '=';
SEMICOLON : ';';

IF    : 'if';
THEN  : 'then';
ELSE  : 'else';
WHILE : 'while';
OUT   : 'out';
SKIPP : 'skip';

POW : '^';
MUL : '*';
DIV : '/';
MOD : 'mod';
ADD : '+';
SUB : '-';

NOT : '!';
LT  : '<';
LEQ : '<=';
GT  : '>';
GEQ : '>=';
EQ  : '==';
NEQ : '!=';
AND : '&';
OR  : '|';

NAT    : '0' | [1-9][0-9]*;
BOOL   : 'true' | 'false';

DOT    : '.';
TOSTR  : 'tostr';
STRING : '"' STRCHR* '"';
fragment STRCHR : ~["\\] | ESC;
fragment ESC    : '\\' [btnfr"'\\];

ID  : [a-z]+;
WS  : [ \t\n\r]+ -> skip;
