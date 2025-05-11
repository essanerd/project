package set16;
// Return max from int[].

public class Q131 {
    public static void main(String[] args) {
        int [] array = {1,2,5,};
        Q131.maximumValue(array);
    }

    public static void maximumValue(int[] array){
        if (array[0] > array[1] && array[0] > array[2]){
            System.out.println(array[0]);
        }
        else if (array[1] > array[0] && array[1] > array[2]){
            System.out.println(array[1]);
        }
        else if (array[2] > array[1] && array[2] > array[0]){
            System.out.println(array[2]);
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        } // better way to do it.
    }
}
