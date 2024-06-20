import java.util.Scanner;

public class Askingtheuser {
    public static void main(String[] args) {

//        int [] nums = new int[]{};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write Array size :");
        int Size = scanner.nextInt();
        int[] nums = new int[Size];


        System.out.println(" Write first Number");
        nums[0] = scanner.nextInt();

        System.out.println(" Write second Number");
        nums[1] = scanner.nextInt();


        System.out.println(" write third Number");
        nums[2] = scanner.nextInt();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println(nums[i]);
            }
        }
    }
}

