package set16;

import java.util.Arrays;

//Question: Write a method that takes an int[] array and doubles each element.
public class Q119 {
    public static void main(String[] args) {
        int[] array = {5,4,3,6};
        int[] finaled = Q119.doubleValues(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] doubleValues(int[]array){
        for (int i = 0; i < array.length; i++){
           array[i] = array[i] * 2;
        }
        return array;
    }
}
