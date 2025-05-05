package set15;

import java.util.ArrayList;
import java.util.Collections;

public class Q106 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list , "Apple" , "banana" , "mango");

        if (list.isEmpty()) {
            System.out.println("List is empty!");
        }
        else {
            System.out.println("list has elements");
        }
    }
}
