package set2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("the first letter of your name is "+ name.charAt(0));
    }
}
