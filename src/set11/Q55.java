package set11;

import java.util.Arrays;
import java.util.Scanner;

public class Q55 {
    public static void main(String[] args) {

        int[] array = new int[5];
        Scanner object = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("enter number");
            array[i] = object.nextInt();
        }
        System.out.println("you have entered these numbers " +array [0] + ", " + array[1] + ", " +  array[2] + ", " + array[3] + ", " + array[4]);

    }
}

/*
    enter number:
    5
    enter number:
    15
    enter number:
    52
    enter number:
    53
    enter number:
    55

    You have entered:
    5
    15
    52
    53
    55

*/