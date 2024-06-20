import java.util.Scanner;

public class SwitchStatmentAssignment {

    public static void main(String[] args) {
        // giving the user access to the terminal
        Scanner scanner = new Scanner(System.in);
        // giving the user directions
        System.out.println(" write a number");
        // saving the users ansewer
        int num = scanner.nextInt();
        // giving my two ansewer choices
        String result = num % 2 == 0 ? "even" : "odd";
// telling java that I'm declaring switch on result
        switch (result) {
            // if even print even
            case "even":
                System.out.println("even");
                break; // if this is true stpop and don't print anything else
            case "odd":// if odd print odd
                System.out.println("odd");
                break;
        }
    }
}