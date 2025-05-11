package set16;

import java.util.Arrays;

//Print all elements of String[]
public class Q132 {
    public static void main(String[] args) {
        String[] string = {"Syed", "Essa", "Ahmed"};
        Q132.allElements(string);
    }

    public static void allElements(String[] string) {
        System.out.println(Arrays.toString(string));
        for (String s : string) {
            System.out.println(s);
        } // a way to get it out of brackets
    }
}
