package set11;

public class Q62 {
    public static void main(String[] args) {
        int [] array = {1,2,3};
        int helper = array[0];
        int helper2 = array[array.length-1];
        array[0] = helper2;
        array[array.length-1] = helper;

        for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);

        }
    }
}
