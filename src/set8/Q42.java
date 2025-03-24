package set8;

import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a statment");
        String statment = scanner.nextLine();
        System.out.println(statment.charAt(statment.length() - 1));
    }
}
