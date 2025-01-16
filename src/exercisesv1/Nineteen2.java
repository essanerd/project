package exercisesv1;

import java.util.Arrays;

public class Nineteen2 {
    public static void main(String[] args) {
        int[]array1 = {10,92,3,68};
        int[]array3 = {10,20,23,24,68};
        int[]array2 = new int[array1.length + array3.length];
        for (int i=0; i<array1.length; i++ ){
            array2[i] = array1[i];

        }for (int i=0; i<array3.length; i++ ){
            array2[i+array1.length] = array3[i];
        }
        System.out.println(Arrays.toString(array2));

    }
}
