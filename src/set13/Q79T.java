package set13;

import java.util.Scanner;

public class Q79T {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("enter a number");
        int number = object.nextInt();

        int count = 0;
        int temp = Math.abs(number);

        if (temp == 0) {
            count = 1;
        } else {
            temp = temp ;
            count++;
        }
        int helper = 0;
        while (temp != 0){
         temp =temp   / 10 ;
            count++;
             helper =count-1;

        }
        System.out.println("this is how many numbers there are " + helper );
    }
}
