import java.util.Scanner;

public class AddingSpaces2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "enter a number");
        int n = scanner.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++)
                System.out.print(" ");
            for ( int j =1; j<=2*i-1; j++)
                if (i==n)
                    System.out.print("*");
            else
                if (j==1||j==2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();;
    }
}
}
