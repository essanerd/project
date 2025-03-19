package set2;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
       // System.out.println("The first three letters of your name are \n " + name.charAt(0) + name.charAt(1) + name.charAt(2));
        System.out.println("The first three letters of your name are \n " + name.substring(0,2)); // this works better but alwas make the last index 1 more than it is .
    }
}
