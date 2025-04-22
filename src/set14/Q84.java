package set14;

import java.util.Scanner;

public class Q84 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        System.out.println("enter first number");
        int squared1 = object.nextInt();

        System.out.println("enter second number");
        int squared2 = object.nextInt();

        System.out.println("enter third number");
        int squared3 = object.nextInt();

        System.out.println(squared1 * squared1  + " " + squared2 * squared2  + " " + squared3*squared3 );

    }
}
