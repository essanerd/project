package set11;

import java.util.Scanner;

public class Q64 {
    public static void main(String[] args) {
        int i =0;
        int[] array = {0};
        Scanner object = new Scanner(System.in);
        System.out.println("enter the size of your array");
        int nums1 = object.nextInt();
        array.length=nums1;
        for ( i = 0; i <= array.length; i++) {
            System.out.println("Enter number");
            array[i] = object.nextInt();
        }
        System.out.println("enter a number that you want to search in the array");
        int helper = object.nextInt();
        if (array[i] == helper){
        System.out.println(array[i]);
    }else{
        System.out.println("Error! number not found");
    }

}
}
