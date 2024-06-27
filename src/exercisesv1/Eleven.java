package exercisesv1;

import java.util.Arrays;

public class Eleven {
    public static void main(String[] args) {
        int[] array1 = {50, -20, 0};
        int[] array2 = {5, -50, 10};
        int[] array3 = new int[2];
        array3[0] = array1[0];
        array3[1] = array2[2];
        System.out.println(Arrays.toString(array3));
    }
}
