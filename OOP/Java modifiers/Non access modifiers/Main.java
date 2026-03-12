// Non-Access Modifiers
// Non-access modifiers do not control visibility (like public or private), but instead add other features to classes, methods, and attributes.

// The most commonly used non-access modifiers are final, static, and abstract.


// Final
// If you don't want the ability to override existing attribute values, declare attributes as final:
public class Main {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 50; // will generate an error: cannot assign a value to a final variable
    myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}


// // Static
// A static method belongs to the class, not to any specific object. 
// This means you can call it without creating an object of the class

public class Main{
    // Static Method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
  }
     // Main method
    public static void main(String[] args) {
        myStaticMethod();         // Call the static method
        Main.myStaticMethod();    // Or call it using the class name
  }
}
// Note: A static method belongs to the class itself. You can call it without creating an object, 
// but it cannot use variables or methods that belong to an object.


// Abstract
// An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:
// example  inside abtract folder



// For classes:- 
// you can use either final or abstract:
// final	  : The class cannot be inherited by other classes (You will learn more about inheritance in the Inheritance chapter)	
// abstract : 	The class cannot be used to create objects (To access an abstract class, it must be inherited from another class. 
// You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters)


// For attributes and methods, you can use the one of the following:-
// final	      : Attributes and methods cannot be overridden/modified
// static	      : Attributes and methods belong to the class, not to objects. This means all objects share the same static attribute, and static methods can be called without creating objects.
// abstract	    : Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters
// transient	  : Attributes and methods are skipped when serializing the object containing them
// synchronized : Methods can only be accessed by one thread at a time
// volatile	    : The value of an attribute is not cached thread-locally, and is always read from the "main memory"