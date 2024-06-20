import java.util.Scanner;

public class Mortgagecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Loan Amount:");
        float loan = scanner.nextFloat();

        System.out.println("Enter Interest Rate:");
        float interestRate = scanner.nextFloat();

        System.out.println("Enter Years:");
        float years = scanner.nextFloat();

        double mortgage = loan / years;


            System.out.println("***********************");
            System.out.println("Your Loan Details");
            System.out.println("***********************");
            System.out.println("Loan Amount: " + loan);
            System.out.println("Interest Rate: " + interestRate);
            System.out.println("Year: " + years);
            System.out.println("Mortgage Payment: " + mortgage);
        }
    }
 