package set3;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int length = scanner.nextInt();
        System.out.println("Enter the width of your rectangle");
        int width = scanner.nextInt();
        int twice = length+length;
        int twice2 = width+width;
        int total = twice2+twice;
        System.out.println("The perimeter of your rectangle is " + total);
    }
}
