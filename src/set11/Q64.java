package set11;

import java.util.Scanner;

public class Q64 {
    public static void main(String[] args) {
        int index = 0;

        Scanner object = new Scanner(System.in);
        System.out.println("enter the size of your array");
        int size = object.nextInt();
        int[] array = new int[size];

        for (index = 0; index < array.length; index++) {
            System.out.println("Enter number");
            array[index] = object.nextInt();
        }

        System.out.println("enter a number that you want to search in the array");
        int valueToSearch = object.nextInt();

        for (index = 0; index < array.length; index++) {
            if (array[index] == valueToSearch) {
                System.out.println(array[index]);
                return;
            }
        }

        System.out.println("Error! number not found");
    }
}
