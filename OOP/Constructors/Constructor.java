// A constructor in Java is a special method that is used to initialize objects.
// The constructor is called when an object of a class is created.
// It can be used to set initial values for object attributes:

public class Constructor{
    int x;

    // Create a class constructor for the Constructor class
    public Constructor(){
        x=5
    }

    public static void main(String[] args){
        Constructor myObj=new Constructor(); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.x);
    }
}
// Outputs 5
Note that the constructor name must match the class name, and it cannot have a return type (like void).
Also note that the constructor is called when the object is created.
All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, 
then you are not able to set initial values for object attributes.



Constructor Parameters
The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y). 
When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5:
public class Main{
    int x;
    public Main(int y){
        x=y;
    }
    public static void main(String[] args){
        Main obj= new Main(5);
        System.out.println(obj.x);
    }
}
// outputs 5


You can have as many parameters as you want:
public class Main {
  int modelYear;
  String modelName;

  public Main(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Main myCar = new Main(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

// Outputs 1969 Mustang



