package set4;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int nums = scanner.nextInt();
        for ( int i = 12; i>=1; i--){
            System.out.println(nums + " * "+ i +" = " + i*nums);
        }
    }
}
/*
2*1=2
2*2=4
2*3=6

*/