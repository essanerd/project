import java.util.Scanner;

public class Exceeds100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("keep Entering Numbers");
        int sum = scanner.nextInt();
        while (sum<100){

           sum+=scanner.nextInt();
        }
        System.out.println("you have exceeded the limit of 100");
    }
}
