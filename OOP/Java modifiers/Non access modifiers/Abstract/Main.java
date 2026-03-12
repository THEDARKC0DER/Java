//abstract class
abstract class Main{
    public String fname="John";
    public int age = 24; 
    public abstract void study();  //abstract method
    // so this abstract method does not have a body and the body is provided by the subclasss
    // here the subclass is Student
}

// subclass (extends Main)
class Student extends Main{
    public int graduationYear =2023;
    public void study(){
        System.out.println("Studying all day long");
    }
}

// Conclusion: An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass

