package set16;

import java.util.ArrayList;
import java.util.Collections;

// Return ArrayList<String> with 3 items
public class Q136 {
    public static void main(String[] args) {
        System.out.println(Q136.arrayListWithThreeItems());;
    }
    public static ArrayList<String> arrayListWithThreeItems(){
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Apple" , "Banana" , "Strawberry");
        return list;

    }

}
