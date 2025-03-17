package set1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Add the two numbers
        double sum = num1 + num2;

        // Print the result
        System.out.println("The sum is: " + sum);
    }
}
