import java.util.Scanner;

public class DoWhileLoopsExercise {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.println("enter a number between one and ten");
            n=scanner.nextInt();
        }while (n<1 || n>10);
        System.out.println( n+ " is between one and ten");

    }
}