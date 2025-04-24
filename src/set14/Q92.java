package set14;

import java.util.Scanner;

public class Q92 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("enter a statment");
        String statment = object.nextLine();

        String[] array = statment.split("");
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(" ")) {
                amount++;
            }
        }
        System.out.println(amount);
    }
}
