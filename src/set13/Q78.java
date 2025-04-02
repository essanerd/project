package set13;

import java.util.Scanner;

public class Q78 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("enter a number");
        int number = object.nextInt();
        int i = 1;
        while (i <= 12) {
            System.out.println( number + " * " + i + " = " + i * number);
            i++;
        }
    }
}
