Java this Keyword
The this keyword in Java refers to the current object in a method or constructor.
The this keyword is often used to avoid confusion when class attributes have the same name as method or constructor parameters.
(but 'this' keyword creates more confusion LOL)


Accessing Class Attributes
Sometimes a constructor or method has a parameter with the same name as a class variable. 
When this happens, the parameter temporarily hides the class variable inside that method or constructor.

To refer to the class variable and not the parameter, you can use the this keyword:
public class Main{
    int x= x; //this is a class variable x
    
    // constructor with a paramerter x
    public Main(int x){
        this.x=x; //refers to the class variable x
    }
    public static void main(String[] args){
        Main myObj = new Main(5);
        System.out.println("Value of x = " + myObj.x);
    }
}
Tip: Think of this.x = x; as: "this.x (the class variable) gets the value of x (the parameter)."
Without this, the code above x = x; would set the parameter x equal to itself, and the class variable would stay uninitialized (0).
