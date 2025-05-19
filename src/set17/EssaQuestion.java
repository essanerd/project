package set17;

import java.util.HashMap;
import java.util.Scanner;

public class EssaQuestion {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "banana");
        map.put(3, "pear");
        map.put(4, "mango");

        System.out.println("enter a role number 1 - 4 ");
        int roleNumber = object.nextInt();

       if (roleNumber < map.size()){
           System.out.println(map.get(roleNumber));
       }
       else {
           System.out.println("role number not found");
       }

    }
}
