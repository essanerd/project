package exercisesv1;

public class Fourteen {
    public static void main(String[] args) {
        int[] array = {20,30,40};
        if (array[0] > array[1]&& array[0] > array[2]){
            System.out.println(array[0]);
        } else if (array[1] > array[0] &&array[1] > array[2]) {
            System.out.println(array[1]);
        }else
            System.out.println(array[2]);

    }
}
