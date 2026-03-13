// Enum Constructor
// An enum can also have a constructor just like a class.
// The constructor is called automatically when the constants are created. You cannot call it yourself.
// Here, each constant in the enum has a value (a string) that is set through the constructor:


enum Level{

    LOW("Low level"),
    MEDIUM("Medium level"),
    HIGH("High level");
    
    // Field (variable) to store the desc text
    private String description;

    //Constructor (runs once for each constant above)
    private Level(String description){
        this.description=description;
    }

    // getter method to read the description
    public String getDescription(){
        return description;
    }
    
}

public class Main{
    public static void main(String[] args){
        Level myVar= Level.MEDIUM; 
        System.out.println(myVar.getDescription()); 
    }
}
// Note: The constructor for an enum must be private. If you don't write private, Java adds it automatically.

// // Loop Through Enum with Constructor
// You can also loop through the constants and print their values using the values() method:
for (Level myVar : Level.values()) {
  System.out.println(myVar + ": " + myVar.getDescription());
}
