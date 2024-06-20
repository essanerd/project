package exercisesv1;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minutes");
        int minutes = scanner.nextInt();
        int seconds = minutes * 60;
        System.out.println(minutes + " minutes = " + seconds + " seconds");
    }
}