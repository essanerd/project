package exercisesv1;

import java.util.Arrays;

public class thirteen {
    public static void main(String[] args) {
        int[]array = {1,2,3};
        int array2 =array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = array[array.length - 2];
        array[array.length - 2] = array2;
        System.out.println(Arrays.toString(array));
    }
}
