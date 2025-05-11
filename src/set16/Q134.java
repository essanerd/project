package set16;

//  Return longest word from String[]
public class Q134 {
    public static void main(String[] args) {
        String[] array = {"essa", "ahmed", "syed"};
        System.out.println( Q134.longestWordInArray(array));
    }

    public static String longestWordInArray(String [] array) {
        String longest = array[0];
        for (int i = 0; i < array.length; i++) {
           if (array[i].length() > longest.length()){
               longest = array[i];
           }
            }
        return longest;
        }
    }

