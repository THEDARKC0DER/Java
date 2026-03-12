// Java Class Methods
// methods are declared within a class, and that they are used to perform certain actions:

// Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run the program:

public class Main{
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args){
        Main myCar= new Main();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}


// Using Multiple Classes
// it is a good practice to create an object of a class and access it in another class.
// Main.java 
// public class Main {
//   public void fullThrottle() {
//     System.out.println("The car is going as fast as it can!");
//   }

//   public void speed(int maxSpeed) {
//     System.out.println("Max speed is: " + maxSpeed);
//   }
// }
// Second.java
// class Second {
//   public static void main(String[] args) {
//     Main myCar = new Main();     // Create a myCar object
//     myCar.fullThrottle();      // Call the fullThrottle() method
//     myCar.speed(200);          // Call the speed() method
//   }
// }