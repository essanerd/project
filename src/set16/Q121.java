package set16;
import java.util.ArrayList;
import java.util.Collections;
// Question: Write a method that returns an ArrayList<Integer> containing numbers 1 to 5.

public class Q121 {
    public static void main(String[] args) {
ArrayList<Integer> finaled = Q121.listOneToFive();
        System.out.println(finaled);
    }
    public static ArrayList<Integer> listOneToFive(){
ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5);
        return list;
    }
}
