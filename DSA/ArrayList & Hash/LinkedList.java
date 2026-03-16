import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}

// addFirst()	Adds an element to the beginning of the list	
// addLast()	Add an element to the end of the list	
// removeFirst()	Remove an element from the beginning of the list	
// removeLast()	Remove an element from the end of the list	
// getFirst()	Get the element at the beginning of the list	
// getLast()	Get the element at the end of the list

// Without var
LinkedList<String> cars = new LinkedList<String>();

// With var
var cars = new LinkedList<String>();


// The List Interface
// Note: Sometimes you will see both List and LinkedList in Java code, like this:

import java.util.List;
import java.util.LinkedList;

List<String> cars = new LinkedList<>();
This means the variable (cars) is declared as a List (the interface), but it stores a LinkedList object (the actual list). Since LinkedList implements the List interface, this is possible.

It works the same way, but some developers prefer this style because it gives them more flexibility to change the type later.
