package chapter1.topic3;
import java.util.Random;

/**
Import statements tell Java which packages to look in for classes.Java classes are grouped into packages.
Remove above import statement and you will get "Random cannot be resolved to a type" exception
*/


public class PackageImports {
	public static void main(String[] args) {
		 Random r = new Random();
		 System.out.println(r.nextInt(10)); // print a number between 0 and 9
	}
	
}





/**

Wildcards (*) :
Classes in the same package are often imported together.
eg.  java.util.*; 
Every class in the java.util package is available to this program when Java compiles it. It doesn’t import child packages, fi elds, or
methods; it imports only classes. 
You might think that including so many classes slows down your program, but it doesn’t. The compiler fi gures out what’s actually needed.
Listing the classes used makes the code easier to read, especially for new programmers.





Redundant imports :

1. Well what about System class? there were no errors! Its bcoz there’s one special package in the Java called java.lang
which is automatically imported. Explicitly importing this package unnecessary.

2. Another case of redundancy involves importing a class that is in the same package as the
class importing it. Java automatically looks in the current package for other classes.

3. Now let’s consider some imports that don’t work:
import java.nio.*; // NO GOOD – a wildcard only matches
 //class names, not "file.*Files"
import java.nio.*.*; // NO GOOD – you can only have one wildcard
 //and it must be at the end
import java.nio.files.Paths.*; // NO GOOD – you cannot import methods
 //only class names





Naming Conflicts :
One of the reasons for using packages is so that class names don’t have to be unique across
all of Java. This means you’ll sometimes want to import a class that can be found in multiple places.
eg. java.util.Date and java.sql.Date. 
 
Examples :
1. 
import java.util.*;
import java.sql.*; // DOES NOT COMPILE. Exception : The type Date is ambiguous

2. 
import java.util.Date;
import java.sql.*;
If you explicitly import a class name, it takes precedence over any wildcards present.

3. 
import java.util.Date;
import java.sql.Date;
// Exception : The import java.sql.Date collides with another import statement


4. If You Really Need to Use Two Classes with the Same Name then..
4.1 import one and use fully qualified calss name for the other
import java.util.Date; 
public class Conflicts {
 Date date;
 java.sql.Date sqlDate;
}

or

4.2 import nothing and always use fully qualified class name
public class Conflicts {
 java.util.Date date;
 java.sql.Date sqlDate;
}





Default package :
The code without a package name is in the default package.
This is a special unnamed package that you should use only for throw-away code.




Compiling Code with Packages :
1. open cmd inside your project folder
2. to compile 
javac packagea/ClassA.java packageb/ClassB.java 
If the command does work, two new files will be created : packagea/ClassA.class and packageb/ClassB.class
3. to run 
java packageb.ClassB
//Note : ClassB only and not ClassB.class in above cmd



Class Paths and JARs
java -cp "C:\temp\directoryWithJars\*" myPackage.MyClass
This command will add all the JARs to the class path that are in directoryWithJars. It
won’t include any JARs in the class path that are in a subdirectory of directoryWithJars.
 
*/


