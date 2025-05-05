package set15;

import java.util.ArrayList;
import java.util.Collections;

public class Q98 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Lebron" , "is" , "better" , "than" , "curry");
        System.out.println(list);
        System.out.println(list.toArray().length);
        list.clear();
        System.out.println(list);
        System.out.println(list.toArray().length);

    }
}
