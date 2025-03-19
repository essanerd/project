package set2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a positive or negative number");
        int nums = scanner.nextInt();
        if (nums >= 0) {
            System.out.println("you're number is poitive");
        }else{
            System.out.println("you're number is negative");
        }
    }
}
