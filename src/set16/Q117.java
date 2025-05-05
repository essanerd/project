package set16;

import java.util.Scanner;

public class Q117 {
    public static void main(String[] args) {
        Q117.largerNumber();
    }
    public static double largerNumber(){
        Scanner object = new Scanner(System.in);
        System.out.println("enter a decimal number");
        double number1 = object.nextDouble();
        System.out.println("Enter decimal number");
        double number2 = object.nextDouble();
        if (number1 < number2){
        }
        else{
            System.out.println(number2);
        }
        return largerNumber();
    }
}
