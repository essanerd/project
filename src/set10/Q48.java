package set10;

public class Q48 {
    public static void main(String[] args) {
        int [] array = {2, 3, 4};
        if (array[0] % 2  == 0 && array[1] % 2 == 0 && array[2] % 2 == 0){
            System.out.println("all are even");
        } else if (array[0] % 2  == 0 && array[1] % 2 == 0 && array[2] % 2 != 0 || array[1] % 2 != 0 || array[2] % 2 != 0) {
            System.out.println("two are even");
        } else {
            System.out.println("all are odd");
        }
    }
}
