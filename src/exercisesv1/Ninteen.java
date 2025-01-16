package exercisesv1;

import java.util.Arrays;

public class Ninteen {
    public static void main(String[] args) {
        int[] array1 = {1, 1,3};
        int[] array2 = {2, 2, 3, 1, 4};
        int[] array3 = {array2.length+array1.length};
        for (int i = 0; i <= array1.length+array2.length; i++) {
            if (i < array1.length) {
                array3[i] += array1[i];
            } else if (i> array1.length) {

                array3[i] += array2[i];

            }
        }
        System.out.println(array3);


    }
}
