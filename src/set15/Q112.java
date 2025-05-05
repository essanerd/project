package set15;

import java.util.ArrayList;
import java.util.Collections;

public class Q112 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list , "apple" , "banana" , "apple" , "mango" , "banana" , "pear");


        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if (!list2.contains(list.get(i))) {
                list2.add(list.get(i));
            }
        }
        System.out.println(list2);
    }
}
