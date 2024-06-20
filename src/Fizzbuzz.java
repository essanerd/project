import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        int number = scanner.nextInt();
        if (number % 5 == 0 &&  number % 3 == 0) {
            System.out.println("fizzbuzz");
        }
        if (number % 5 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 != 0) {
            System.out.println("buzz");
        }
        System.out.println("Write another number");
        int number1 = scanner.nextInt();
        if (number1 % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println("buzz");
        }


        }
        {

        }
        {
        }

    }



