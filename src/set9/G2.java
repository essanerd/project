package set9;

import java.util.Random;
import java.util.Scanner;

public class G2 {
    public static void main(String[] args) {

        Random random = new Random();           // Random object to generate random numbers
        String[] operators = {"+", "-", "*", "/"};   // Array of operators in char form
        double answer = 0;  // to track expected answer of each question
        int score = 0;  // to track the score of user for all questions

        // Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to math wizard quiz");
        System.out.println("Enter how may questions do you want");
        int totalNumberOfQuestions = scanner.nextInt();

        // Print the math problem
        for (int i = 1; i <= totalNumberOfQuestions; i++) {

            int num1 = random.nextInt(10) + 1; // Generate a random number between 1 to 10
            int num2 = random.nextInt(10) + 1; // Generate a random number between 1 to 10

            String randomOperator = operators[random.nextInt(operators.length)];  // Randomly picking up the operator from our operators array

            switch (randomOperator) {
                case "+":
                    answer = num1 + num2;
                    break;
                case "-":
                    answer = num1 - num2;
                    break;
                case "*":
                    answer = num1 * num2;
                    break;
                case "/":
                    answer = num1 / num2;
                    break;
            }

            System.out.println("Solve: " + num1 + " " + randomOperator + " " + num2);   // Showing question to the user
            System.out.println("write your answer and click enter to proceed");
            int saver = scanner.nextInt();  // Saving user answer

            // Comparing user answer with expected answer and incrementing score if correct
            if (saver == answer) {
                score++;
            }

        }

        // Printing final score
        if (score == 5) {
            System.out.println("You are a math master");
        } else {
            System.out.println("you got " + score + " out of " + totalNumberOfQuestions);

        }
    }
}

