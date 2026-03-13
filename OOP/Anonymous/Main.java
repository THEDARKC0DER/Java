// An anonymous class is a class without a name. It is created and used at the same time

//normal class
class Animal{
    public void makeSound(){
        System.out.println("Animal Sound");

    }

}

public class Main{
    public static void main(String[] args){
        // Anonymous class that overrides makeSound()
        Animal myAnimal = new Animal(){ // this is an anonymous class??
            public void makeSound(){
                System.out.println("WOOF WOOF");
            }
        }; // Semicolon is req to end the line of the code that creates the object
    myAnimal.makeSound();
    }
}



// Anonymous Class from an Interface
// You can also use an anonymous class to implement an interface on the fly:

//Interface
interface Greeting{
    void sayHello();
}
public static void main(String[] args){
    //Anonymous class that implements greeting
    Greeting greet = new Greeting(){
        public void sayHello(){
             System.out.println("Hello, World!");
        }
    }; // imp
    greet.sayHello();
}

// Use anonymous classes when you need to create a short class for one-time use. For example:

// Overriding a method without creating a new subclass
// Implementing an interface quickly
// Passing small pieces of behavior as objects