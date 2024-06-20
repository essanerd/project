import java.util.Scanner;

public class PrimeUmbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a number");
        int nums = scanner.nextInt();
        if (nums%2 ==1 ) {
            System.out.println("this is a prime number");
        }
        else{
            System.out.println("this is not a prime number");
        }

    }
}
