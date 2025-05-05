package set16;

import java.util.Scanner;

public class FunctionTesting {

    public static void main(String[] args) {
        myTestMthod();  // Call the method

    }

    // Method that asks the user for two numbers and adds them
    public static void addTwoNumbers() {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();  // Read first number

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();  // Read second number

        int sum = num1 + num2;  // Add the numbers

        System.out.println("The sum is: " + sum);  // Print the result
    }

    public static void myTestMthod() {
        addTwoNumbers();
    }

    public static void greet() {
        System.out.println("Hello!");
    }

    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static String getDefaultNumber() {
        return "Essa";
    }

    public static int add(int a, int b) {
        return a + b;
    }


}


