package set6;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter either a division, subtraction, addition or multiplication sign ");
        String op = scanner.nextLine();
        System.out.println("enter your first number");
        int nums1 = scanner.nextInt();
        System.out.println("enter second number");
        int nums2 = scanner.nextInt();
        switch (op){
            case"+":
                System.out.println("The sum of your two numbers is " + nums1 + nums2);
                break;
            case "/":
                System.out.println("The quotient of your two numbers " + nums1/nums2);
                break;
            case "*":
                System.out.println("The product of your two numbers is " + nums1*nums2);
                break;
            case "-":
                int helper = nums1 - nums2;
                System.out.println("Thee difference of your to numbers is " + helper);

        }
    }
}
