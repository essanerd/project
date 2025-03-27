package set11;

import java.util.Arrays;
import java.util.Scanner;

public class Q55 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner object = new Scanner(System.in);
        System.out.println("enter 4 numbers");
        int nums = object.nextInt();
        Arrays.fill(array,nums);
        System.out.println(array);

    }
}
