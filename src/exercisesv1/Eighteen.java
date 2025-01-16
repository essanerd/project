package exercisesv1;

import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {

        int[] array = {1,2,3,6,9,2,5,6};
        int number = 3;
        int howmanytimes2comes = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 3){
                howmanytimes2comes ++;
            }
        }
        System.out.println(array.length - howmanytimes2comes);
    }
}

