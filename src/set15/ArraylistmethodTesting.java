package set15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistmethodTesting {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add(1, "Banana");
        list.addAll(Arrays.asList("Orange", "Mango"));
        list.addAll(2, Arrays.asList("grapes", "pineapple"));
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        boolean exists = list.contains("Strawberry");
        if (exists) {
            System.out.println(exists + " found");
        } else {
            System.out.println(exists + ", not found");
        }
        list.ensureCapacity(6);
        list.forEach(item -> System.out.println(item));// does what you need a for each loop to do
        String fruit = list.get(2);
        System.out.println("-----");
        System.out.println(fruit);
        System.out.println("-----");
        System.out.println(list.indexOf("Orange"));


    }
}
