package set15;

import java.util.ArrayList;
import java.util.Collections;

public class Q95 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "apple" , "banana" , "grapes");
        list.remove(1);
        System.out.println(list);
    }
}
