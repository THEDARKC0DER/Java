// A package in Java is used to group related classes.
// . Packages are divided into two categories:
// Built-in Packages (packages from the Java API)
// User-defined Packages (create your own packages)

// Built-in Packages
// https://docs.oracle.com/javase/8/docs/api/
// To use a class or a package from the library, you need to use the import keyword:
// import package.name.Class;   // Import a single class
// import package.name.*;   // Import the whole package

import java.util.Scanner;
// java.util is a package, while Scanner is a class of the java.util package.

class Main{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Username");

        String userName= myObj.nextLine(); 
        System.out.println("UserName is " + userName);
    }
}