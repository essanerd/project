import java.util.Scanner;

public class Readinginput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Age:");
        byte age = scanner.nextByte();
        System.out.println("you are " + age);



        Scanner scanner1= new Scanner(System.in);
        System.out.print("Age:");
        float Age = scanner.nextFloat();
        System.out.println("you are " + age);




        Scanner scanner2 = new Scanner(System.in);
        System.out.println("name: ");
        String name=scanner2.next();
        System.out.println("you are" +  name);


        Scanner scanner3 = new Scanner(System.in);
        System.out.println("name: ");
        String name1=scanner2.next();
        System.out.println("you are" +  name);


        Scanner scanner4 = new Scanner(System.in);
        System.out.println("name: ");
        String name2=scanner2.nextLine().trim();
        System.out.println("you are" +  name);

    }
}