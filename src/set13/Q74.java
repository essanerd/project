package set13;

public class Q74 {
    public static void main(String[] args) {
        int counter = 0;
        int counter2 = 0;

        System.out.println("From For Loop");
        for(counter = 0; counter < 10; counter++){
            System.out.println("Printing counter: " + counter);
        }

        System.out.println("--------------------------------------");

        System.out.println("From While Loop");
        while(counter2 < 10){
            System.out.println("Printing counter: " + counter2);
            counter2++;
        }

        System.out.println("--------------------------------------");

        System.out.println("From Do-While Loop");
        int counter3 = 10;
        do{
            System.out.println("Printing counter: " + counter3);
            counter3++;
        } while(counter3 < 10);
    }
}
