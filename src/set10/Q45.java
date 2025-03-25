package set10;

import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("you will need to enter five number");
        System.out.println("enter first number");
        int num1 = object.nextInt();
        System.out.println("enter second number");
        int num2 = object.nextInt();
        System.out.println("enter third number");
        int num3 = object.nextInt();
        System.out.println("enter fourth number");
        int num4 = object.nextInt();
        System.out.println("enter fifth number");
        int num5 = object.nextInt();
        int[] numbers = {num1,num2,num3,num4,num5};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
    }
}
