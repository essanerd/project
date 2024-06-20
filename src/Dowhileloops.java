import java.util.Scanner;

public class Dowhileloops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("input:");
            input = scanner.next().toLowerCase();
            System.out.println(input);
            do {
                System.out.println("input:");
                input = scanner.next().toLowerCase();
                System.out.println(input);
            }while (!input.equals("quit"));
        }
    }
}