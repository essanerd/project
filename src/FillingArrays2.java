import java.util.Scanner;

public class FillingArrays2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter some number (max 20 minimum 1)");
        int nums = scanner.nextInt();

        while (nums > 20|| nums<=0){
            System.out.println("invalid number");
            nums= scanner.nextInt();
            int []numbers=new int[nums];
        }
    }
}
