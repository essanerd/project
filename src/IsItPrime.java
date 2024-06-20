import java.util.Scanner;

public class IsItPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int nums = scanner.nextInt();
        ans(nums);

    }

    public static void ans(int x) {
        if (x % 2 == 0) {
            System.out.println("even");
        } else System.out.println("odd");

    }
}
