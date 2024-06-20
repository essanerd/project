package exercisesv1;

import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first numbers");
        int num1 = scanner.nextInt();
        System.out.println("enter second numbers");
        int num2 = scanner.nextInt();
        if (num1 > num2) {


            System.out.println(num1);
        } else if (num2 > num1) {

            System.out.println(num2);
        } else
            System.out.println("0");


    }
}
