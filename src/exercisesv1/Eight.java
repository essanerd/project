package exercisesv1;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter first  number ");
        int num1 = scanner.nextInt();
        System.out.println(" enter second number");
        int num2 = scanner.nextInt();
        System.out.println("enter third number");
        int num3 = scanner.nextInt();
        if (num1 - num2 >= 20)
            System.out.println(" true ");
        else if (num1 - num3 >= 20) {
            System.out.println("true");
        } else if (num2 - num3 >= 20)
            System.out.println("true");
        else if (num2 - num1 >= 20) {
            System.out.println("true");

        } else if (num3 - num1 >= 20) {
            System.out.println("true");
        } else if (num3 - num1 >= 20) {
            System.out.println("true");
        } else
            System.out.println("false");
    }
}
