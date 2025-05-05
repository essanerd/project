package set15;

import java.util.ArrayList;
import java.util.Scanner;

public class Q97 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Scanner object = new Scanner(System.in);
        System.out.println("Enter 1 if you want to add a word. Enter 2 if you want to make the size." +
                "Enter 3 if you want to exit");
        int answer = object.nextInt();

        object.nextLine();
        if (answer == 1) {
            System.out.println("enter the thing you want to add");
            String Occasion1 = object.nextLine();
            list.add(Occasion1);
            System.out.println(list);

        }
            else if (answer == 2){
            System.out.println("enter the size");
            int size = object.nextInt();

            // Fill the list with null (or any placeholder)
            while (list.size() < size) {
                list.add(null);
            }
            System.out.println("the size is now " + list.size());
        }
            else{
            System.out.println("Exiting...");
            object.close();
        }
    }
}
