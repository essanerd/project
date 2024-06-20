import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FillingArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 4 numbers");
        int nums = scanner.nextInt();
        int[]Array = new int[4];
        Arrays.fill(Array,nums);
        System.out.println(Array);
    }
}
