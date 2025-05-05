package set15;

import java.util.ArrayList;
import java.util.Scanner;

public class Q105 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int random = (int) java.lang.Math.round(java.lang.Math.random() * 10);
        System.out.println(random);

        String names = "";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= random; i++){
            System.out.println("Enter a name");
             names = object.nextLine();
            list.add(names);
        }

        System.out.println(list);
    }
}
