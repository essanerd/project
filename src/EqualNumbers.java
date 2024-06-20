import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {

        // Declaring an array with size 4 only, no values
        int[] array = new int[4];

        // Asking user for 4 digit number and saving it
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a four digit number");
        int nums = scanner.nextInt();

        // Looping through the user input to break it into single numbers and populate array
        for (int i = 0; i < array.length; i++) {
            int new_val = nums / 10;
            int single_val = nums % 10;
            array[i] = single_val;
            nums = new_val;
        }


        int first_two_nums = array[0] + array[1];
        int last_two_nums = array[2] + array[3];

        if (first_two_nums == last_two_nums) {
            System.out.println("lucky");
        } else
            System.out.println("unlucky");
    }

}

