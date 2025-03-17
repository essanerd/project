package set1;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Print the multiplication table
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
