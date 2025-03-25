package set10;

public class Q50 {
    public static void main(String[] args) {
        int [] array = {5,7,5};
        if (array[0] == 5 && array[1] == 5 && array[2] == 5){
            System.out.println("all are five");
        } else if (array[0] == 5 && array[1] == 5 && array[2] != 5 || array[1] != 5 || array[0] != 5) {
            System.out.println("two of them are five");
        }
        else{
            System.out.println("none are fives");
        }
    }
}
