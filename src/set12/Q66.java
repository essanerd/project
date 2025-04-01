package set12;

import java.util.Scanner;

public class Q66 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter one of the three traffic light colors");
        String light = object.nextLine();
        switch (light){
            case "green":
                System.out.println("go ahead");
                break;
            case "red":
                System.out.println("STOP");
                break;
            case "yellow":
                System.out.println("if you are close and have not stopped go ahead");
                break;
            default:
                System.out.println("Not a traffic light color");
        }
    }
}
