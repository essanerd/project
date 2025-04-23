package set14;

import java.util.Scanner;

public class Q87 {
    public static void main(String[] args) {
       //Scanner object = new Scanner(System.in);

       // System.out.println("Enter a statment");
        //String statment = object.nextLine();

      //  String cleaned = statment.trim().toUpperCase();

       // System.out.println(cleaned);

        System.out.println("---------------------------------------------------");

        Scanner object = new Scanner(System.in);

        System.out.println("Enter a statement");
        String statment = object.nextLine();


        String cleaned = statment.toUpperCase().trim();

        System.out.println(cleaned);

        System.out.println("---------------------------------------------------");
        
     //   Scanner object = new Scanner(System.in);

      //  System.out.println("Enter a statement:");
       // String statement = object.nextLine();  // Read input from user

        // Trim and convert to uppercase
       // String trimmed = statement.trim();         // Remove leading/trailing whitespace
       // String uppercase = trimmed.toUpperCase();  // Convert to uppercase

        // Print the final result
       // System.out.println("Result: " + uppercase);
    }
}
