package set16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Print ArrayList<String> in uppercase
public class Q137 {

    public static void main(String[] args) {

        ArrayList<String> mylist = new ArrayList<>();
        Collections.addAll(mylist, "Essa" , "Apple" , "Blank");
        System.out.println(Q137.listToUpperCase(mylist));
        int alex = 5;
        int joe = 10;
        int john = 11;
        double received = Q137.myTest(alex, joe, john);
        System.out.println(received);
    }

    public static double myTest(int a, int b, int c){
        double answer = (a + b) / c;
        return answer;
    }

    public static ArrayList<String> listToUpperCase(ArrayList<String> list) {
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
       list2.add(list.get(i).toUpperCase());
      }
        return list2;
    }
}
