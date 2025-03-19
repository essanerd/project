package set5;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of your cube");
        int length = scanner.nextInt();
        System.out.println("The volume of your cube is " + length*length*length);
    }
}
