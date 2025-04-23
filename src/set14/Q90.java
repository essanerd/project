package set14;

import java.util.Scanner;

public class Q90 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("enter a statment");
        String statment = object.nextLine();

        String [] array = object.delimiter().split("");
        System.out.println(array);

      //  System.out.println(statment.length());
    }
}
