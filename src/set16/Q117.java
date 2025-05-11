package set16;
// Question: Write a method that takes two doubles and prints the larger one.

import java.util.Scanner;

public class Q117 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("enter a decimal number");
        double number1 = object.nextDouble();
        System.out.println("Enter decimal number");
        double number2 = object.nextDouble();
        double larger = Q117.largerNumber(number1,number2);
        System.out.println("The largest of " + number1 + " and " + number2 +  " is "  + larger);
    }

    public static double largerNumber(double a, double b) {
     //   if (a < b) {
    //        return b;
     //   }
      //  else {
        return (a > b) ? a : b; // better way using ternary operator

    }
    }

