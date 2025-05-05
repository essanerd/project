package set15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Q100 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner object = new Scanner(System.in);
        System.out.println("enter first name");
        String name1 = object.nextLine();
        list.add(name1);
        System.out.println("enter second name");
        String name2 = object.nextLine();
        list.add(name2);
        System.out.println("enter third name");
        String name3 = object.nextLine();
        list.add(name3);
        list.sort((a, b) -> b.compareTo(a));
        list.sort((c, b) -> c.compareTo(b));
        System.out.println(list);
    }

}
