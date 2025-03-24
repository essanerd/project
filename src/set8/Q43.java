package set8;

import java.util.Scanner;

//Ask user for a string and a word to replace with another word given by user.
public class Q43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a statment");
        String statment = scanner.nextLine();
        System.out.println("Now enter a word to replace one word in the statment");
        String replacer = scanner.nextLine();
        System.out.println("Now enter the word you wanna replace");
        String word = scanner.nextLine();
        String replacement = statment.replace(word, replacer);
        System.out.println(replacement);
    }
}
