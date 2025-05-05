package set15;

import java.util.ArrayList;
import java.util.Collections;

public class Q110 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,  "green", "blue", "red", "yellow", "black", "purple", "brown", "orange");
        int i =0;
        for ( i = 0; i < list.toArray().length-1; i++){}
        System.out.println(list.get(0) + " " + list.get(i));
    }
}
