package set15;

import java.util.ArrayList;

public class Q107 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            list.add(i*i);
        }
        System.out.println(list);
    }
}
