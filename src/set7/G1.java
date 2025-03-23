package set7;

import java.util.Scanner;
public class G1 {
    public static void main(String[] args) {
        int saver;
        int attempt;
        int num = (int) java.lang.Math.round(java.lang.Math.random() * 20);
        Scanner scanner = new Scanner(System.in);
        System.out.println("A wizard has chosen a secret number between 1 and 20. You must guess the number, and the wizard will give you hints like “Too high!” or “Too low!” until you get it right!");
        for (attempt = 0; attempt <= 3; attempt++) {
            System.out.println("enter number");
             saver = scanner.nextInt();

        }  if ( saver == num) {
            System.out.println("Congratulations you did it");
        } else if (saver <= num) {
            System.out.println("Wrong! higher");
        } else {
            System.out.println("Wrong! lower");
        }
    }


}

