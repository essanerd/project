import java.util.Scanner;

public class FibanaciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int nums = scanner.nextInt();
        for ( int i = 1; i <= nums ; i++){
            System.out.println( i + 1);
        }

    }
}
