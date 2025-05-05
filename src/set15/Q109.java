package set15;

import java.util.ArrayList;
import java.util.Collections;

public class Q109 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "green", "blue", "red", "yellow", "black", "purple", "brown", "orange");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() <= 4) {
                list.remove(i);
                i--; // Step back to account for the shift
            }
        }
        System.out.println(list);
    }
}
