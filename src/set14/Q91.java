package set14;

import java.util.Scanner;

public class Q91 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("enter your full name");
        String name = object.nextLine();

        String[] array = name.split("");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sb = sb.append(array[i].charAt(0));
        }

        System.out.println(sb);
    }
}
