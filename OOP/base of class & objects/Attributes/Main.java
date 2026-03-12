// In the previous chapter, we used the term "variable" for x in the example (as shown below).

// In Java, variables declared inside a class are called "attributes".

// You can also say that attributes are variables that belong to a class:


public class Main{
    int x=1;
    int y=2;
}
// Another name for attributes is fields.

//Accessing Attributes
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}



// Modify Attributes
public class Main {
  int x;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}


//  override existing values:
public class Main {
  int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
  }
}



// If you don't want the ability to override existing values, declare the attribute as final:
public class Main {
  final int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
// The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).

// The final keyword is called a "modifier". You will learn more about these in the Java Modifiers Chapter.



// Multiple Attributes
// You can specify as many attributes as you want:
public class Main {
  String fname = "John";
  String lname = "Doe";
  int age = 24;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
}