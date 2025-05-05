package set16;
// Question: Write a method that takes an ArrayList<String> and prints each element.

import java.util.ArrayList;
import java.util.Collections;

public class Q120 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Lebron" , "is" , "better" , "than" , "curry");
        Q120.eachElement(list);
    }
    public static void eachElement(ArrayList list){
         list.forEach(item -> System.out.println(item));

    }
}
