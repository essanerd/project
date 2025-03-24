package set7;

import java.util.Scanner;

public class G1 {
    public static void main(String[] args) {
        int saver;
        int attempt;
        int helper = 5;
        int num = (int) java.lang.Math.round(java.lang.Math.random() * 20);
        System.out.println(num);
        Scanner scanner = new Scanner(System.in);
        System.out.println("A wizard has chosen a secret number between 1 and 20. You must guess the number, and the wizard will give you hints like “Too high!” or “Too low!” until you get it right!");
        for (attempt = 0; attempt <= helper; attempt++) {
            System.out.println("enter number");
            saver = scanner.nextInt();
            if (saver == num) {
                System.out.println("Congratulations you did it");
                break;
            } else if (saver <= num) {
                System.out.println("Wrong! higher");
                System.out.println(helper-attempt + " attempts left");
            } else {
                System.out.println("Wrong! lower");
                System.out.println(helper-attempt + " attempts left");
            }
        }


    }
}

