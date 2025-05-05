package set15;

import java.util.ArrayList;
import java.util.Scanner;

public class Q101 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner object = new Scanner(System.in);
        int apple = 0;
        for (int i  = 0; i < 5; i++){
            System.out.println("Enter a fruit name");
            String fruit = object.nextLine();
            list.add(fruit);
            if (list.get(i).equals("apple")){
                apple++;
            }
        }
        System.out.println(apple);
    }
}
