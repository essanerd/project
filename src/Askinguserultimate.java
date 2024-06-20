import java.util.Arrays;
import java.util.Scanner;

public class Askinguserultimate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write Array size :");
        int Size = scanner.nextInt();
        int[] nums = new int[Size];

        //for ( int i = 0; i == nums.length;)
        for (int i = 0; i < nums.length; i++) {
            System.out.println("write number");
            int size1 = scanner.nextInt();
            System.out.println((size1));


            for (int e = 0; e < nums.length; e++) {
                if (nums[e] % 2 == 0) {


                }
            }
        }
    }
}

