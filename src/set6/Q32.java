package set6;

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first side of your triangle");
        int side1 = scanner.nextInt();
        System.out.println("Enter the second side of your triangle");
        int side2 = scanner.nextInt();
        System.out.println("Enter the third side of your triangle");
        int side3 = scanner.nextInt();
        if(side1==side2 && side1 == side3){
            System.out.println("That is an equilateral triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("that is an isosceles triangle");
        }else  {
            System.out.println("that is an scalene triangle");
        }
    }
}
