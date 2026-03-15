// An ArrayList is like a resizable array


// The var Keyword
// Without var
ArrayList<String> cars = new ArrayList<String>();

// With var
var cars = new ArrayList<String>();

// The List Interface
import java.util.List;
import java.util.ArrayList;

List<String> cars = new ArrayList<>();
// This means the variable (cars) is declared as a List (the interface), but it stores an ArrayList object (the actual list). 
// Since ArrayList implements the List interface, this is possible.

