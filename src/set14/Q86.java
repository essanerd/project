package set14;

public class Q86 {
    public static void main(String[] args) {
        int [] array = {1,-2,3};
        for (int i = 0; i <= 2; i++){
            if (array[i] < 0){
                array[i] = 0;
            }
        }
        System.out.println(array[0] + " " + array[1] + " " + array[2]);
    }
}
