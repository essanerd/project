import java.util.Scanner;

public class NegativeOrPositive2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("keep entering numbers");
        int nums = scanner.nextInt();
        do {
            nums = scanner.nextInt();


        } while (nums < 0);


        if (nums < 0) {
            System.out.println(" please enter a posititve");
        } else if (nums == 99) {
            System.out.println("Done");
            {

            }


        }
    }
}