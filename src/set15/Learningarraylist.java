package set15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Learningarraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();  // declaring an empty array list
        Collections.addAll(list, "One", "Two", "Three"); // adding multiple values to arraylist together
        list.add("jumbo");   // adding one value at a time
        list.add("panda");  // adding one value at a time
        System.out.println(list); // this prints all values comma separated as array as [One, Two, Three, jumbo, panda]

// Printing using for-loop one value at a time
        int numbers = 0;
       // for (int j = 0; j < list.size(); j++) System.out.print(numbers.get(j));


        for (String item : list) System.out.print(numbers);
        //Printing using for-each loop one value at a time
    }

}
