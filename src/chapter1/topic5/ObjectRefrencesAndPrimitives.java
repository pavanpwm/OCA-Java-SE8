package chapter1.topic5;


/**

Java applications contain two types of data: PRIMITIVE types and REFERENCE types.

1. Primitives Types
-hold their values in the memory where the variable allocated
-8 types in java
-These eight data types represent the building blocks for Java objects, because all Java objects are 
just a complex collection of these primitive data types.
1. boolean	| true or false
2. byte 	| 8  bit int value  -128 to 127
3. short	| 16 bit int value  -32k to 32k
4. int		| 32 bit int value  -2B to 2B
5. long		| 64 bit int value  -9B to 9B
6. float	| 32 bit fractional value.  Sufficient for storing 6 to 7 decimal digits
7. double	| 64 bit fractional value. Sufficient for storing 15 decimal digits
8. char		| 16 bit int(unicode) value. Stores a single character/letter or ASCII values

Note: A float requires the letter f following the number so Java knows it is a float. and similarly 

When a number is present in the code, it is called a LITERALS. By default, Java assumes you are defining an int
value with a literal. In this example, the number listed is bigger than what fits in an int.
long max = 3123456789; // DOES NOT COMPILE even though we have declared it as long. Java complains the number is out of range.
The solution is to add the character L to the number:
long max = 3123456789L; // now Java knows it is a long. You can use small "l" too



Java allows you to specify digits in several other formats
-octal-base-8 (digits 0–7), which uses the number 0 as a prefix—for example, 017
-hexadecimal-base-16 (digits 0–9 and letters A–F), which uses the number 0 followed by x or X
as a prefix—for example, 0xFF
-binary-base-2 (digits 0–1), which uses the number 0 followed by b or B as a prefix—for example, 0b10



You can have underscores in numbers to make them easier to read:
int million2 = 1_000_000;
You can add underscores anywhere except at the beginning of a literal, the end of a literal, right before a
decimal point, or right after a decimal point. Let’s look at a few examples:
double notAtStart = _1000.00; // DOES NOT COMPILE
double notAtEnd = 1000.00_; // DOES NOT COMPILE
double notByDecimal = 1000_.00; // DOES NOT COMPILE
double annoyingButLegal = 1_00_0.0_0; // this one compiles


 */







public class ObjectRefrencesAndPrimitives {
	float num = 1.5f;
	public static void main(String[] args) {
		//What is the largest int?
		System.out.println(Integer.MAX_VALUE + " == " + (Math.pow(2, 32)/2-1));
	}

}



/**

2. Reference Types 
-A reference type refers to an object (an instance of a class). 
-do not hold the value of the object 
-Instead, a reference “points” to an object by storing the memory
address where the object is located, a concept referred to as a pointer 
-Unlike C, Java does not allow you to learn what the physical memory address is.

Declaring reference types:
	java.util.Date today;
	String greeting;

Initializing reference types :
A value is assigned to a reference in one of two ways:
-A reference can be assigned to another object of the same type.
-A reference can be assigned to a new object using the new keyword. 
	today = new java.util.Date();
	greeting = "How are you?";
The today reference now points to a new Date object in memory, and today can be used to access the various fields and methods of this Date object. 
The String and Date objects do not have names and can be accessed ONLY via their corresponding reference.


Reference types can be assigned null, which means they do not currently refer to an object.
Reference types can be used to call methods when they do not point to null. 
Finally, notice that all the primitive types have lowercase type names. All classes that
come with Java begin with uppercase.

*/


