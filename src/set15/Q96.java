package set15;

import java.util.ArrayList;
import java.util.Collections;

public class Q96 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Strawberry" , "Mango" , "Watermelon");

        boolean exists = list.contains("Strawberry");
        if (exists) {
            System.out.println(exists + " found");
        } else {
            System.out.println(exists + ", not found");
        }
    }
}
