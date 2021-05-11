package chapter1.topic2;

// Writing main() method


/**
 * A Java program BEGINS EXECUTION with its main() method. i.e main method DECLARES the entry point.
 * A main() method is the GATEWAY between the startup of a Java process, which is managed by the JVM and the beginning of the programmer’s CODE. 
 * JVM calls on the underlying system to allocate memory and CPU time, access files, and so on. 
 *The main() method lets us hook our code into this process, keeping it alive long enough to do the work we’ve coded. 
 *
 */



public class MainMethod {
	
	public static void main(String[] a) {
		System.out.println(a[0]);
		System.out.println(a[1]);
	}

}


/**
 * To COMPILE and EXECUTE the code from cmd:
 * 1. javac ClassName.java
 * 2. java ClassName
 * Notice that we MUST OMIT the .class extension to run ClassName.java because the period has a reserved meaning in the JVM. 
 * 
 * 
 * We can pass arguments separated by spaces while executing
 * 1. javac ClassName.java
 * 2. java ClassName arg1  "arg2 with space in it"
 * All command line arguments are treated as strings
 * 
 * 
 * 
 * 
 * To REVIEW(check exceptions etc), you need to have a JDK to compile because it includes a compiler.
 * You do not need to have a JDK to run the code—a JRE is enough.
 * Java class files run on the JVM and therefore run on any machine with Java rather than just the machine or operating system they happened to have been compiled on.
 * 
 * 
 * 
 * 
 * If you get any errors while COMPILING:
 * 1. Check that you have installed JDK and NOT jre.
 * 2. The JDK should be added to the PATH
 * 
 * To compile a java code:
 * 1. file must have the extension .java. 
 * 2. only one class should be made public
 * 3. name of the file must match the name of that one public class
 * 4. and that one public class should have main method
 * 
 * 
 * The MAIN method
 * 1. It must be PUBLIC
 * 2. It must be STATIC
 * 3. It must have return type of VOID
 * 4. It must accept array of String parameters:  (String[] args) or (String args[]) or (String[] a)
 * 
 * 
 * 
 * 
 * 
 * 
 * The RESULT of compilation is a files of BYTECODE by the SAME NAME but with .class extension
 * It consists of instructions that JVM knows how to execute
 */