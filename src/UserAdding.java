import java.util.Scanner;

public class                                     UserAdding {
    public static void main(String[] args) {
        int array[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a five digit number");
        int nums = scanner.nextInt();
        int sum = 0;
        while (nums > 0) {
            sum += nums % 10;
            nums/= 10;

        }
        System.out.println("sum="+ sum);
    }
}
