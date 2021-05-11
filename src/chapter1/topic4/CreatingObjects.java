package chapter1.topic4;


/**
An object is an INSTANCE of a class.

Steps to create
1. declare the type i.e ClassName
2. give variable name (this gives java a PLACE to store reference of the object)
3. then you write < = new ClassConstructorMethod(); >

Constructors :
-the name of the constructor matches the name of the class, and there’s no return type.
eg. public ClassName(){}      // valid
	public void ClassName()   // invalid - no return type
-The PURPOSE of a constructor is to initialize fields, although you can put any code in there
-The compiler will implicitly supply a DEFAULT constructor which does nothing except
-This default constructor will call the no-argument constructor of the superclass. In this situation, 
 the compiler will complain if the superclass doesn't have a no-argument constructor so you must verify that it does.
-If you need two constructors, one with arguments and one without, you need to manually define both.
*/




public class CreatingObjects {
	//Reading and Writing Object Fields == Getting and Setting object Fields
	//1. Directly setting and getting while declaring vars
	int num = 10;
	int numSquare = num*num;
	
	
	//2. get and set DIRECTLY (i.e without using setter and getter methods) using object
	String name;

	public static void main(String[] args) {
		CreatingObjects obj = new CreatingObjects();
		//setting
		obj.name = "Boku to Kimi";
		//getting
		System.out.println(obj.name);
	}
	
}



/**
Code blocks : anything between braces {} eg. methods, conditional blocks, instance initializer blocks etc

INSTANCE INITIALIZER Blocks :
Sometimes code blocks are inside a method. These are run when the method is called.
Other times, code blocks appear OUTSIDE A METHOD. These are called instance initializers
eg.
   public static void main(String[] args) {
 	  { System.out.println("Feathers"); }
   }
{ System.out.println("Snowy"); }

Above code sample has 3 code blocks and 1 II block







Order of Initialization when an object of class is created
-Fields and instance initializer blocks are run in the order in which they appear in the file.
-The constructor runs after all fields and instance initializer blocks have run.

But you should remember that java execution starts with main method and everything before the object creation is executed first.
eg. 
public class Egg {
 public Egg() {
 number = 5;
 }
 public static void main(String[] args) {
 Egg egg = new Egg();
 System.out.println(egg.number);
 }
 private int number = 3;
 { number = 4; } 
}
Flow of execution:
1. main()
2. when creating egg object :
2.1 1st line < private int number = 3; > is executed 
2.2 then { number = 4; }
2.3 then the constructor

*/














