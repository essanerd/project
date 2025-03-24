package set8;

import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence = scanner.nextLine();
        System.out.println("Now enter a word that we need to search for in that sentence");
        String word = scanner.nextLine();
        if (sentence.contains(word)){
        System.out.println("true");
    }else {
            System.out.println("false");
        }

    }
}
