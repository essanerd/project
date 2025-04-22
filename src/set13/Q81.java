package set13;

import java.util.Scanner;

public class Q81 {
    public static void main(String[] args) {
        int i = 0;
        int oddnumbers = 0;
        int evennumbers = 0;

        Scanner object = new Scanner(System.in);

        int[] array = new int[10];

        for (i = 0; i < 10; i++) {
            System.out.println("enter a number");
            array[i] = object.nextInt();
            if (array[i] % 2 == 1) {
                oddnumbers++;
            }else {
                evennumbers++;
            }
        }
        if (evennumbers>oddnumbers){
            System.out.println("there are more even numbers");
        }else {
            System.out.println("there are more odd numbers ");
        }

    }
}
