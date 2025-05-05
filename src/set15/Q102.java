package set15;

import java.util.ArrayList;
import java.util.Collections;

public class Q102 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "black" , "yellow" , "purple" , "blue" , "green");
        System.out.println(list.indexOf("blue"));
    }
}
