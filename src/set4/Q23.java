package set4;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of numbers you want us to calculate then give the average");
        int nums = scanner.nextInt();
        double sum=0;
        for (int i = 1; i<=nums; i++){
            System.out.println("enter numbers");
            sum=sum+scanner.nextInt();

        }
        System.out.println("the average of your numbers is " + sum/nums);
    }
}
