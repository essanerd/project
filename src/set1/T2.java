package set1;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        System.out.println("welcome to the conversion tool kit \n 1 - convert minutes to seconds\n 2 - kilograms to grams");
        Scanner scanner = new Scanner(System.in);
        System.out.println("pick a number according to what you want to do");
        int number = scanner.nextInt();
        if (number == 1){
            System.out.println("Enter minutes");
            int minutes = scanner.nextInt();
            System.out.println("the conversion of you're minutes numbers is " + minutes * 60);
        }else {
            System.out.println("Enter kilograms");
            int kilograms = scanner.nextInt();
            System.out.println("the conversion of you're kilograms is " + kilograms * 1000);
        }
    }
}
