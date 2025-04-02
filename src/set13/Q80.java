package set13;

import java.util.Scanner;

public class Q80 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int i = 0;
        int[] array = new int[5];
        for ( i = 0; i < 3; i++) {
            System.out.println("Enter a number");
            array[i] = object.nextInt();
        }
        if (array[0] > array[1] && array[0] > array[2]) {
            System.out.println(array[0]);
        } else if (array[1] > array[2] && array[1] > array[0]){
            System.out.println(array[1]);
        }else {
            System.out.println(array[2]);
        }
    }
}
