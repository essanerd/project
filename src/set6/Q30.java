package set6;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a letter");
        String letter = scanner.nextLine();

//        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
//        if (letter.equals("a") | letter.equals("e") | letter.equals("i") | letter.equals("o") | letter.equals("u")) {

            if (letter.equals("a")) {
                System.out.println("that is a vowel");
            } else if (letter.equals("e")) {
                System.out.println("that is a vowel");
            } else if (letter.equals("i")) {
                System.out.println("that is a vowel");
            } else if (letter.equals("o")) {
                System.out.println("that is a vowel");
            } else if (letter.equals("u")) {
                System.out.println("that is a vowel");
            }else{
                System.out.println("that is a consonant");
            }
    }
}
