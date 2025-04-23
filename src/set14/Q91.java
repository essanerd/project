package set14;

import java.util.Scanner;

public class Q91 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("enter your full name");
        String name = object.nextLine();

        char ch = name.charAt(0);
        String finalizer = Character.toString(ch).toUpperCase();
        String finalized = name.substring(ch,name.indexOf(" ")).toUpperCase();
        System.out.println(finalized);
    }
}
