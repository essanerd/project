import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "enter a number");
        int n = scanner.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++)
                System.out.print(i);
            System.out.println();
        }
    }
}
