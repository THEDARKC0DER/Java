// Calling a Constructor from Another Constructor
// You can also use this() to call another constructor in the same class.
// This is useful when you want to provide default values or reuse initialization code instead of repeating it.


public class Main{
    int modelYear;
    String modelName;

    // constructor with one parameter
    public Main(String modelName){ //parameter modelName....diff from class variable modelName
        //call the two-parameter constructor to resuse code and set a default year
        this(2020,modelName);
    }

    // constructor with two parameter
    public Main(int modelYear, String modelName){
        //use 'this' to assign values to the class variables
        this.modelYear= modelYear;
        this.modelName= modelName;
    }


    // Method to print car inf
    public void printinfo(){
        System.out.println(modelYear + " " + modelName);
    }

    public static void main(String[] args){
        // create a car with only model name (uses default year)
        Main car1 = new Main("Corvette");


        // car with both
        Main car2 = new Main(1969, "Mustang");

        car1.printinfo();
        car2.printinfo();

    }
}

// IMP
// this(2020, modelName) tells Java to call another constructor of the same class,
// and Java chooses the constructor whose parameter list matches the arguments.

// How Java decides which constructor to call
// Java uses method overloading rules. It matches based on:

// number of parameters
// types of parameters
// order of parameters