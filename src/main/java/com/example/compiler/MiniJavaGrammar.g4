grammar MiniJavaGrammar;

// Parser rules
program     : mainClass (classDeclaration)* EOF;
mainClass   : 'class' IDENTIFIER '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' IDENTIFIER ')' '{' statement '}' '}';
classDeclaration
            : 'class' IDENTIFIER ('extends' IDENTIFIER)? '{' (varDeclaration)* (methodDeclaration)* '}';

varDeclaration
            : type IDENTIFIER ';';

methodDeclaration
            : 'public' type IDENTIFIER '(' (parameter (',' parameter)*)? ')' '{' (varDeclaration)* (statement)* 'return' expression ';' '}';

parameter   : type IDENTIFIER;

type        : 'int' '[' ']'
            | 'boolean'
            | 'int'
            | 'String'
            | IDENTIFIER;

statement   : '{' (statement)* '}'
            | 'if' '(' expression ')' statement ('else' statement)?
            | 'while' '(' expression ')' statement
            | 'System.out.println' '(' expression ')' ';'
            | IDENTIFIER '=' expression ';'
            | IDENTIFIER '[' expression ']' '=' expression ';';

expression  : expression ('&&' | '||' | '==' | '/' | '>' | '=<' | '>=' | '<' | '+' | '-' | '*') expression
            | expression '[' expression ']'
            | expression '.' 'length'
            | expression '.' IDENTIFIER '(' (expression (',' expression)*)? ')'
            | INTEGER_LITERAL
            | STRING_LITERAL
            | 'true'
            | 'false'
            | IDENTIFIER
            | 'this'
            | 'new' 'int' '[' expression ']'
            | 'new' IDENTIFIER '(' ')'
            | '!' expression
            | '(' expression ')';

// Lexer rules
IDENTIFIER          : [a-zA-Z][a-zA-Z0-9_]*;
INTEGER_LITERAL     : [0-9]+;
STRING_LITERAL      : '"' (~["\r\n])* '"';
WHITESPACE          : [ \t\r\n]+ -> skip;
LINE_COMMENT        : '//' ~[\r\n]* -> skip;
BLOCK_COMMENT       : '/*' .*? '*/' -> skip;
