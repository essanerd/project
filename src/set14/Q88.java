package set14;

import java.util.Scanner;

public class Q88 {
    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        System.out.println("enter your full name");
        String name = object.nextLine();

//        int index =  name.indexOf(" ");
        String finalized = name.substring(0,name.indexOf(" ")).toLowerCase();
        System.out.println(finalized);
    }
}
