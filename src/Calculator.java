import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what operator do you want to use");
        String operator = scanner.nextLine();
        System.out.println("enter first number ");
        int nums1 = scanner.nextInt();
        System.out.println("enter second number");
        int nums2 = scanner.nextInt();

        if (operator.equals("+")) {
            System.out.println(nums1 + nums2);
        }
        else if (operator.equals( "-")) {
            System.out.println(nums1 - nums2);
        }
        else if (operator.equals("*")) {
            System.out.println(nums1 * nums2);
        }
        else if (operator.equals("/")) {
            System.out.println(nums1 / nums2);
        }

    }
    }