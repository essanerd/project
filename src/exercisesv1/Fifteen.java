package exercisesv1;

import java.util.Arrays;

public class Fifteen {
    public static void main(String[] args) {
        int[] array = {3, 2};
        int array2 =array[0];
        array[0] = array[array.length - 1];
        array[1] = array2;

        System.out.println(Arrays.toString(array));
    }
}
