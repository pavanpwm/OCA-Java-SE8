package chapter1.topic1;


//  Understanding Java Class structure



/**
There are THREE types of comments in Java.
1. Single line comment - everything after // 
2. Multi-line comment - inside     /*  and */
/**
3. Javadoc multiline comment - starts with /** and ends with  */


/**
Examples: 
	1. single line comment 			// /* dog */   	
/**
    2. multiline  					/* elephant */



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/**
 * Classes are the BASIC BULDING blocks.
 * To use most classes, you have to create objects. An object is a RUNTIME INSTANCE of a class in memory
 * All the various objects of all the different classes represent the STATE of your program.
 * Java classes have TWO PRIMARY elements : FIELDS and METHODS  = MEMBERS of the class
 *  
 *  
 * Other building blocks include INTERFACE and ENUMS
 * 
 */


/**
 * Simple java class
 * class keyword used to define a class


 * defining a variable involves  type/class and identifier/name
 * 
 * 
 * Defining a method involves RETURN type, METHOD name with PARAMETERS
 * VOID is also a return type
 * The full declaration of a method is called a METHOD SIGNATURE
 */

class JavaClassStructure {
	
	String name;	
	
	void setName(String newName) {
		name = newName;
	}
	
}



/**
 * Classes vs Files
 * 1. Generally each class is defined in its  *.java FILE.
 * 2. Java DOESNT REQUIRE class to be PUBLIC
 * 3. Can put TWO or MORE classes in the SAME FILE. 
 * 3.1  If none of the defined class are made public, then the file name DOESNT MATTER
 * 3.2  Only one class can be made public and the class name and file name SHOULD MATCH
 * 3.3  The public class doesnt have to be the one with main method.
 * 
 */
