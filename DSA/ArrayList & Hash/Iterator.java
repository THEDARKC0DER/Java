// An iterator is a way to loop through elements in a data structure.

// It is called an "iterator" because "iterating" is the technical term for looping.

import java.util.ArrayList;
import java.util.Iterator;

public class Main{
    public static void main(String[]args){
        ArrayList<String> cars= new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // get an iterator for the arraylist 
        Iterator<String> it = cars.iterator();

        //iterate through the list using the iterator
        while( it.hasNext()){
            System.out.println(it.next());
        }
    }
}