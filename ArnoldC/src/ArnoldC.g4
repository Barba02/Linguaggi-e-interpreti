grammar ArnoldC;

main: (TERMINATOR)? (funDeclare TERMINATOR)* BEGIN com END (TERMINATOR funDeclare)* (TERMINATOR)? EOF;

funCall: CALL ID (exp)*;
funDeclare: DECLARE_FUN ID TERMINATOR (FUN_ARGS ID TERMINATOR)* (NONVOID TERMINATOR)? com TERMINATOR END_FUN;

com: IF exp TERMINATOR com (TERMINATOR ELSE TERMINATOR com)? TERMINATOR ENDIF         # if
   | WHILE exp TERMINATOR com TERMINATOR ENDWHILE                                     # while
   | DECLARE ID TERMINATOR INIT exp                                                   # declare
   | USING_VAR ID TERMINATOR (ASSIGN exp TERMINATOR)? (ops TERMINATOR)* END_USING_VAR # modify
   | PRINT exp                                                                        # printVal
   | PRINT STRING                                                                     # printString
   | RETURN (exp)?                                                                    # return
   | ASS_CALL ID TERMINATOR funCall                                                   # assignByCall
   | funCall                                                                          # callFunction
   | com TERMINATOR com                                                               # concatCom;

ops : op=(MUL | DIV | MOD | ADD | SUB) exp # arithmetic
    | op=(EQ | GT | AND | OR) exp          # logical;

exp : INT                # integer
    | val=(TRUE | FALSE) # boolean
    | ID                 # id;

INT          : NAT | '-' POS;
fragment NAT : '0' | POS;
fragment POS : [1-9][0-9]*;
TRUE  : '@NO PROBLEMO';
FALSE : '@I LIED';
STRING          : '"' STRCHR* '"';
fragment STRCHR : ~["\\] | ESC;
fragment ESC    : '\\' [btnfr"'\\];

IF       : 'BECAUSE I\'M GOING TO SAY PLEASE';
ELSE     : 'BULLSHIT';
ENDIF    : 'YOU HAVE NO RESPECT FOR LOGIC';
WHILE    : 'STICK AROUND';
ENDWHILE : 'CHILL';

ADD : 'GET UP';
SUB : 'GET DOWN';
MUL : 'YOU\'RE FIRED';
DIV : 'HE HAD TO SPLIT';
MOD : 'I LET HIM GO';

EQ  : 'YOU ARE NOT YOU YOU ARE ME';
GT  : 'LET OFF SOME STEAM BENNET';
OR  : 'CONSIDER THAT A DIVORCE';
AND : 'KNOCK KNOCK';

DECLARE_FUN : 'LISTEN TO ME VERY CAREFULLY';
NONVOID     : 'GIVE THESE PEOPLE AIR';
FUN_ARGS    : 'I NEED YOUR CLOTHES YOUR BOOTS AND YOUR MOTORCYCLE';
RETURN      : 'I\'LL BE BACK';
END_FUN     : 'HASTA LA VISTA, BABY';
CALL        : 'DO IT NOW';
ASS_CALL    : 'GET YOUR ASS TO MARS';

BEGIN : 'IT\'S SHOWTIME' TERMINATOR;
END   : TERMINATOR 'YOU HAVE BEEN TERMINATED';
PRINT : 'TALK TO THE HAND';

DECLARE       : 'HEY CHRISTMAS TREE';
INIT          : 'YOU SET US UP';
USING_VAR     : 'GET TO THE CHOPPER';
ASSIGN        : 'HERE IS MY INVITATION';
END_USING_VAR : 'ENOUGH TALK';

TERMINATOR : [ \t\r\n]*[\n][ \t\r\n]*;
WS         : [ \t\r]+ -> skip;
ID         : [a-zA-Z0-9]+;
