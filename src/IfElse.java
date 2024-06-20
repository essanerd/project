import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" write a number");
        int size = scanner.nextInt();

        if (size % 2 == 0) {
            System.out.println( size+" is an even number");

        }
        else if(size % 2 == 1){
            System.out.println(size + " is an odd number");
        }


    }
}