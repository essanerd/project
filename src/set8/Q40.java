package set8;

import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first statment");
        String statment1 = scanner.nextLine();
        System.out.println("Enter second statment");
        String statment2 = scanner.nextLine();
        if (statment1.length()==statment2.length()){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }

}
