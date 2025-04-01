package set12;

import java.util.Scanner;

public class Q72 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("enter a word");
        String word = object.nextLine();
        // Convert string to character array
        char[] charArray = word.toCharArray();

        // Print each character
        for (char ch : charArray) {
            System.out.println(ch);
        }

    }
}
