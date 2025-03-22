package set6;
import java.util.Scanner;
public class Q36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0); // Read first character

        if (Character.isDigit(ch)) { // telling java if ch is digit print ch is digit
            System.out.println(ch + " is a digit.");
        } else if (Character.isLetter(ch)) { // if ch is letter print ch is letter
            System.out.println(ch + " is a letter.");
        } else { // otherwise ch is special symbol
            System.out.println(ch + " is a special symbol.");
        }

    }
}
