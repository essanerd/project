package set14;

import java.util.Scanner;

public class Q85 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int i;
        int numbersamount = 0;

        int[] array = new int[10];

        for (i = 0; i < 9; i++) {
            System.out.println("enter a number");
            array[i] = object.nextInt();
        }
        System.out.println("Enter a number that you entered in the ten numbers above");
        int numbers = object.nextInt();

        for (int IndexSearch = 0; IndexSearch <= 9; IndexSearch++ ){
            if (array[IndexSearch] == numbers){
                numbersamount++;
            }
        }
        System.out.println(numbersamount);

    }
}
