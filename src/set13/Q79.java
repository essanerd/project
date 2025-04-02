package set13;

import java.util.Scanner;

public class Q79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int count = 0; // Initialize digit counter
        int temp = Math.abs(number); // Handle negative numbers

        if (temp == 0) {
            count = 1; // Special case for number 0
        } else {
            while (temp > 0) {
                temp = temp / 10; // Remove last digit
                count++; // Increase counter
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
