package set1;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter minutes
        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();

        // Convert minutes to seconds (1 minute = 60 seconds)
        int seconds = minutes * 60;

        // Print the result
        System.out.println(minutes + " minutes is equal to " + seconds + " seconds.");
    }
}
