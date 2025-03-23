package set6;

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System .in);
        System.out.println("Enter a number");
        int nums = scanner.nextInt();
        if (nums%3==0 && nums%7==0){
        System.out.println("That is multiple of 3 and 7");
    }else {
            System.out.println("That is not a multiple of 3 and 7");
        }
    }

}
