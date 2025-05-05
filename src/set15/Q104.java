package set15;

import java.util.ArrayList;
import java.util.Collections;

public class Q104 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list ,  "green", "blue", "red", "yellow"
                , "black", "purple", "brown", "orange");
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        String saver = "";
        for (int i = 0; i < list.toArray().length; i++){
              list2.add(list.get(i).toUpperCase());


        }

        System.out.println(list2);
    }
}
