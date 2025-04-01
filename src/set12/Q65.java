package set12;

import java.util.Scanner;

public class Q65 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("enter a number 1 through 12");
        int number = object.nextInt();

        String[] months = {"january", "february", "march", "april", "may", "june", "july", "august",
                "september", "october", "november", "december"};

        if (number >= 1 && number <= 12) {
            System.out.println(months[number - 1]);
        }
        else{
            System.out.println("invalid number");
        }
    }
}
