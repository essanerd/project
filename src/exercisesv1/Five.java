package exercisesv1;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = scanner.nextInt();
        System.out.println("enter a second number");
        int num2 = scanner.nextInt();
        System.out.println("enter third number");
        int num3 = scanner.nextInt();
        if (num2 > num1 && num3 > num2)
            System.out.println("true");
        else
            System.out.println("False");
    }
}
