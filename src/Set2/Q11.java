package Set2;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int dividend = scanner.nextInt();
        System.out.println("enter second number");
        int divisor = scanner.nextInt();
        System.out.println("The remainder of your to numbers is " + dividend % divisor);
    }
}
