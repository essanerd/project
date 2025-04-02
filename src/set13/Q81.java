package set13;

import java.util.Scanner;

public class Q81 {
    public static void main(String[] args) {
        int [] arrayodd = new int [10];
        int i = 0;
        int[] array = new int[10];
        Scanner object = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.println("enter a number");
            array[i] = object.nextInt();
            if (array[i] % 2 == 0) {
                int[] arrayeven = {array[i]};
            }
            else {
                arrayodd = new int {array[i]};
            }
            System.out.println();

    }
}
