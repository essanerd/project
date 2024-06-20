import java.util.Scanner;

public class Negativeorposititive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("keep entering numbers");
        int nums = scanner.nextInt();
        while (nums >= 0) {
            nums = scanner.nextInt();
        }
        System.out.println("done");

    }

}
