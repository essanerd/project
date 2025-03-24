import java.util.Scanner;

class BankExample {
    private int balance;
    private static final int DEPOSIT_OPTION = 1;
    private static final int WITHDRAW_OPTION = 2;
    private Scanner scanner;

    // Constructor to initialize scanner and balance
    public BankExample() {
        scanner = new Scanner(System.in);
        balance = 0; // Set default balance to 0
    }

    // Main control method that runs the bank operations
    public void mainControl() {
        System.out.println("Welcome to Bank Ahmed!! Please set a starting balance for your account");
        balance = getUserInput("Enter your starting balance: ");

        System.out.println("Current Balance: " + balance);
        System.out.println("Deposit Money -- " + DEPOSIT_OPTION);
        System.out.println("Withdraw Money -- " + WITHDRAW_OPTION);

        int option = getUserInput("Choose an option: ");

        switch(option) {
            case DEPOSIT_OPTION:
                depositMoney();
                break;
            case WITHDRAW_OPTION:
                withdrawMoney();
                break;
            default:
                System.out.println("Invalid option, please try again.");
                break;
        }

        System.out.println("Final Balance: " + balance);
        System.out.println("Thank you for visiting!");
    }

    // Method to handle deposit operation
    private void depositMoney() {
        int depositedMoney = getUserInput("How much money would you like to deposit?");
        balance += depositedMoney;
        System.out.println("Deposited: " + depositedMoney);
        System.out.println("Current Balance: " + balance);
    }

    // Method to handle withdrawal operation
    private void withdrawMoney() {
        int withdrawnMoney = getUserInput("How much money would you like to withdraw?");

        if (withdrawnMoney > balance) {
            System.out.println("Error: Not enough money.");
        } else {
            balance -= withdrawnMoney;
            System.out.println("Withdrawn: " + withdrawnMoney);
            System.out.println("Current Balance: " + balance);
        }
    }

    // Utility method to safely read user input
    private int getUserInput(String prompt) {
        int userInput = -1;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print(prompt);
                userInput = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();  // Consume the invalid input
            }
        }
        return userInput;
    }

    // Main method to start the program
    public static void main(String[] args) {
        BankExample user1 = new BankExample();
        user1.mainControl();
    }
}


/*
import java.util.Scanner;

public class BankExample {
    Scanner scanner = new Scanner(System.in);
    public int balance;
    public int mainControl(){
        System.out.println("Welcome to Bank Ahmed!! Please set a starting balance for your account");
         balance = scanner.nextInt();

        System.out.println("Current Balance: " + balance);
        System.out.println("Deposit Money -- 1");
        System.out.println("Withdraw Money -- 2");
        int option = scanner.nextInt();
        if (option == 1){
            depositMoney();
        }
        else {
            withdrawMoney();
        }
        return balance;
    }

    public int depositMoney(){
        System.out.println("How much Money would you like to deposit?");
        int depositedMoney = scanner.nextInt();
        int i = balance + depositedMoney;
        System.out.println("Current Balance: " + i);
        System.out.println("Thank You for visiting");
        return 0;
    }

    public int withdrawMoney(){
        System.out.println("How much money would you like to withdraw?");
        int withdrawedMoney = scanner.nextInt();
        if (withdrawedMoney>balance){
            System.out.println("Error Not Enough Money");
        }
        else{
            balance-=withdrawedMoney;
            System.out.println("Current Balance: " + balance);
        }
        return 0;
    }


    public static void main(String[] args) {
        BankExample user1 = new BankExample();
        System.out.println(user1.mainControl());
    }

}
*/
