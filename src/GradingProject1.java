import java.util.Scanner;

public class GradingProject1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Math: ");
        int math = scanner.nextInt();

        System.out.print("Enter marks for Science: ");
        int science = scanner.nextInt();

        System.out.print("Enter marks for English: ");
        int english = scanner.nextInt();

        System.out.print("Enter marks for History: ");
        int history = scanner.nextInt();

        double i = ((double) (english + history + science + math) / 400) * 100;

        if (i >= 90) {
            System.out.println("Your Percentage is " + i + "% and Grade is A");
        } else if (i < 90 && i >= 80) {
            System.out.println("Your Percentage is " + i + "% and Grade is B");
        } else if (i < 80 && i >= 70) {
            System.out.println("Your Percentage is " + i + "% and Grade is C");
        } else if (i < 70 && i >= 60) {
            System.out.println("Your Percentage is " + i + "% and Grade is D");
        } else if (i < 60) {
            System.out.println("Your Percentage is " + i + "% and Grade is F");
        }
    }
}
