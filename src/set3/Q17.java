package set3;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of days");
        int days = scanner.nextInt();
        System.out.println("your amount of days converted into hours is " + days*24);
    }
}
