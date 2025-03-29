package set11;

public class Q60 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        for (int i = 0; i < array.length +1; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
