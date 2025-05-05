package set15;

import java.util.ArrayList;
import java.util.Collections;

public class Q111 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10 , -1 , 12, -21);
        for (int i = 0; i < list.toArray().length; i++){
            if (list.get(i) < 1){
                list.set(i , 0);
            }
        }
        System.out.println(list);
    }
}
