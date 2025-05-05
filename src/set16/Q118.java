package set16;

// Question: Write a method that takes an int[] array and returns the average as a double.
public class Q118 {
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 8};
        double finaled = Q118.averageEquals(array);
        System.out.println(finaled);
    }

    public static double averageEquals(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = (double) sum/array.length;
        return average;
    }
}
