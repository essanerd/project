import java.util.Scanner;

public class WhileLoopsExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between one and ten");
        int nums = scanner.nextInt();


        for (int i = 1; i <= 10; i++) {
            if (nums <= 100 && nums > 90) {
                System.out.println("thanks");
                System.exit(0);
            } else {
                System.out.println("sorry try again");
            }
        }
    }
}