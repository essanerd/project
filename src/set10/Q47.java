package set10;

import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {
        int [] array = {6,9,10,19};
        if (array[0] > array[1] && array[0] > array[2] && array[0] > array[3]){
            System.out.println(array[0]);
        } else if (array[1] > array[0] && array[1] > array[2] && array[1] > array[3]) {
            System.out.println(array[1]);
        } else if (array[2] > array[1] && array[2] > array[0] && array[2] > array[3]) {
            System.out.println(array[2]);
        }else {
            System.out.println(array[3]);
        }
    }
}
