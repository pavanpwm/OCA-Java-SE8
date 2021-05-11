package chapter1.topic6;



/**
Variable
A variable is a name for a piece of memory that stores data.
Type, name and value for declaring and initializing. 


Identifiers
3 rules:
-The name must begin with a letter or the symbol $ or _.
-Subsequent characters may also be numbers.
-You cannot use the same name as a Java reserved word.

Although not a rule, java follows CamelCase convention.
Method and variables names begin with a lower case letter followed by CamelCase.
Class names begin with an upper case letter followed by CamelCase. Don’t start any
identifiers with $. The compiler uses this symbol for some files.

  
 */

public class Variables {
	
	//multiple variable declaration an init
	int i1, i2, i3 = 0;	// only i3 is init
	
	//double d1, double d2;  //illegal 
	
}



/**

Default initialization of vars
Some types of variables have value set automatically, and others require the programmer to specify it

Local Variables
A local variable is a variable defined within a method. Local variables MUST be initialized before use 
(can have more complex inits as in if else conditions where compiler knows if the variable is being initialized.)

Instance or class variables or fields = all local variables
static int MAX_LENGTH = 5;   // class variable bcoz it has static
int length= 0;					 // instance variable
As soon as you declare these variables, they are given a default value.
boolean: false
byte,short,int,long: o
float,double: 0.0
char: '\u0000' (NULL)
Everything else = null;

 
Local variables—in scope from declaration to end of block
Instance variables—in scope from declaration until object garbage collected
Class variables—in scope from declaration until program ends
 
 
 
Scope
Local variables can never have a scope larger than the method they are defined in. However, they can have a smaller scope.







Ordering ELEMENTS in a class

Element 						Example 				Required? 				Where does it go?
Package declaration 			package abc; 			No 						First line in the file
Import statements 				import java.util.*; 	No 						Immediately after the package
Class declaration 				public class C 			Yes 					Immediately after the import
Field declarations				int value; 				No 						Anywhere inside a class
Method declarations 			void method() 			No 						Anywhere inside a class


But comments can be anywhere



 */
