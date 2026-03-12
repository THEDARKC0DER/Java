// public class Main
// The public keyword is an access modifier, meaning that it is used to set the access level for classes,
// attributes, methods and constructors.


// We divide modifiers into two groups:

// Access Modifiers - controls the access level
// Non-Access Modifiers - do not control access level, but provides other functionality


Access Modifiers:

For classes :-
you can use either public or default:
public	: The class is accessible by any other class	
default	: The class is only accessible by classes in the same package. This is used when you don't specify a modifier. 
You will learn more about packages in the Packages chapter


For attributes, methods and constructors :-
you can use the one of the following:
public	   : The code is accessible for all classes	
private	   : The code is only accessible within the declared class	
default	   : The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter	
protected  : The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter


Public vs. Private Example
In the example below, the class has one public attribute and one private attribute.

Think of it like real life:
public - a public park, everyone can enter
private - your house key, only you can use it

class Person{
    public String name= "John";
    private int age= 30;

    public class Main{
        public static void main(String[] args){
            Person p = new Person();
            System.out.println(p.name); //works fine
            System.out.println(p.age); //Error: age has private access in Person
        }
    }
}