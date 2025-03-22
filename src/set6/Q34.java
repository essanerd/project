package set6;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter lowercase or uppercase");
        char letter = scanner.next().charAt(0);
        if (Character.isLowerCase(letter)){
            System.out.println("Your letter is lowercase");
        }else {
            System.out.println("Your letter is uppercase");
        }
    }
}
