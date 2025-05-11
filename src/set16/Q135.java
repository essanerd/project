package set16;

import java.util.ArrayList;
import java.util.Collections;

// Return sum of ArrayList<Integer>
public class Q135 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 5,7,3,9);
        System.out.println( Q135.sumOfIntegers(list));
    }
    public static int sumOfIntegers(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum = sum+ list.get(i);
        }
        return sum;
    }
}
