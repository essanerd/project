import java.util.Arrays;
import java.util.Scanner;

public class Userprinting {
    public static void main(String[] args) {

        int[] nums = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write First Number");
        nums[0] = scanner.nextInt();
        System.out.println(" Write Second Number");
        nums[1] = scanner.nextInt();
        System.out.println(" Write third Number");
        nums[2] = scanner.nextInt();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println(nums[i]);

            }
        }
    }
}