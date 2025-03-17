package set1;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int nums1 = scanner.nextInt();
        System.out.println("enter second number");
        int nums2 = scanner.nextInt();
        System.out.println("Enter third number");
        int nums3 = scanner.nextInt();
        int division1 = nums1 % 2;
        int division2 = nums2 % 2 ;
        int division3 = nums3 % 2;
        System.out.println(division1);
        System.out.println(division2);
        System.out.println(division3);
    }
}


