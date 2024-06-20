package exercisesv1;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scanner =new  Scanner (System.in);
        System.out.println("Enter seconds");
        int seconds = scanner.nextInt();
        int minutes = seconds/60;
        System.out.println(seconds + " seconds = " + minutes + " minutes" );
    }
}
