// Java Scope
// In Java, variables are only accessible inside the region where they are created. This is called scope.


// Block Scope
// // A block of code refers to all of the code between curly braces { }
// Variables declared inside a block of code are only accessible by the code between the curly braces, and only after the line in which the variable was declared:
public class Main {
  public static void main(String[] args) {

    // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
      System.out.println(x);

    } // The block ends here

    // Code here CANNOT use x

  }
}

// Loop Scope
// Variables declared inside a for loop only exist inside the loop:
// The for loop has its own block ({ ... }).
// The variable i declared in the loop header (int i = 0) is only accessible inside that loop block.
// Once the loop ends, i is destroyed, so you can't use it outside.
