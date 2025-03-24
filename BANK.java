import java.util.Scanner;

public class BANK {
    Scanenr scanner = new Scanner(System.in);
    public int balance = 0;
    public int setBalance(){
        System.out.println("Welcome to Bank Ahmed!! Please set a starting balance for your account");
     int balance2 = scanner.nextInt();
     balance2+=balance;
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
    }

      public int depositMoney(){
          System.out.println("How much Money would you like to deposit?");
          int depositedMoney = scanner.nextInt();
          depositedMoney+=balance;
          System.out.println("Current Balance: " + balance);
          System.out.println("Thank You for visiting");
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
      }


    public static void main(String[] args) {
          BANK user1 = new BANK();
        System.out.println(user1.setBalance());
    }

}
