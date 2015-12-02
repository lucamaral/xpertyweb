grammar Xperty;

rule_start : IF rule_condition THEN rule_result FI;
rule_condition : attribute conditional value more_condition?;
more_condition : link_condition rule_condition;
link_condition : AND | OR;
rule_result : attribute EQUALS value;
attribute : STRING;
conditional : EQUALS | NOT_EQUAL | GREATER | GREATER_OR_EQUAL | LOWER | LOWER_OR_EQUAL;
value : STRING | number | BOOLEAN;

number : integer | decimal;
positive_integer : INT;
negative_integer : MINUS positive_integer;
integer : positive_integer | negative_integer;
positive_decimal : INT decimal_separator INT;
negative_decimal : MINUS positive_decimal;
decimal : positive_decimal | negative_decimal;
decimal_separator : COMMA | DOT;

IF : 'IF' | 'if';
THEN : 'THEN' | 'then';
FI : 'FI' | 'fi';

STRING : '\'' ('\'\''|~'\'')* '\'' ;
INT : [0-9]+;
BOOLEAN : 'true' | 'false';

MINUS : '-';
COMMA : ',';
DOT : '.';

AND : 'AND' | 'and';
OR : 'OR' | 'or';

NOT_EQUAL : '<>';
GREATER : '>';
GREATER_OR_EQUAL : '>=';
LOWER : '<';
LOWER_OR_EQUAL : '<=';
EQUALS : '=';   