package set15;

import java.util.ArrayList;
import java.util.Collections;

public class Q108 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 56, 78, 35 , 92, 23, 11);

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < 50) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }

}
