package set3;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A chocolate costs 2 dollars how many chocolates would you like to buy ");
        int nums = scanner.nextInt();
        System.out.println("Your total cost is " + nums*2);
    }
}
