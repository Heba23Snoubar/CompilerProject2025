 lexer grammar flaskLexer;

WS : [ \t]+ -> skip;
NEWLINE: ('\r'? '\n')+ -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;
HASH_COMMENT : '#'  ~[\r\n]* -> skip;

DEF : 'def';
RETURN : 'return';
IF: 'if';
ELSE: 'else';
ELIF: 'elif';
FOR: 'for';
IN: 'in';
IMPORT: 'import';
FROM: 'from';
AS: '_';


PLUS: '+';
MINUS : '-';
MULT : '*';
DIV : '/';
ASSIGN : '=';
EQ: '==';
NEQ : '!=';
LT: '<';
GT: '>';
LE:'<=';
GE: '>=';

LPAREN: '(';
RPAREN: ')';
LBRACE : '{';
RBRACE: '}';
LBRACK : '[';
RBRACK: ']';
COMMA: ',';
COLON:':';
DOT: '.';
AT :'@';

NUMBER : [0-9]+ ('.' [0-9]+)? ;
STRING: '"' (~["\\] |'\\' .)* '"' | '\'' (~['\\] | '\\' .)* '\'' ;
ID : [a-zA-Z_][a-zA-Z0-9_]*;