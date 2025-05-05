package set15;

import java.util.ArrayList;
import java.util.Collections;

public class Q103 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list ,  "green", "lbue", "red", "yellow"
                , "black", "purple", "brown", "orange");
        System.out.println(list);

ArrayList<String> list2 = new ArrayList<>();
for (int i = 0; i < list.toArray().length; i++){
    if (list.get(i).startsWith("b")){
        list2.add(list.get(i));
    }
}
        System.out.println(list2);

    }
}
