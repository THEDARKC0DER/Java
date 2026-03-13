// A HashSet is a collection where every element is unique - no duplicates are allowed.

import java.util.HashSet;

public class Main{
    public static void main(String[] args){
        HashSet<String> cars= new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");
        System.out.println(cars);
        
    }
}

// Note: In the example above, even though BMW is added twice it only appears once in the set because every element in a set has to be unique.
