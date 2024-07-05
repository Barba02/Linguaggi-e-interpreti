grammar Brainfuck;

main: com EOF;
com: LT com                 #moveLeft
   | GT com                 #moveRight
   | PLUS com               #increment
   | MINUS com              #decrement
   | DOT com                #output
   | COMMA com              #input
   | LBRACK com RBRACK com  #loop
   |                        #nil; // closure

LT     : '<';
GT     : '>';
PLUS   : '+';
MINUS  : '-';
DOT    : '.';
COMMA  : ',';
LBRACK : '[';
RBRACK : ']';
EXTRA  : . -> skip; // don't consider anything else
