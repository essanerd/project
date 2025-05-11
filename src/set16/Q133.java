package set16;

//Return a String from char[]
public class Q133 {
    public static void main(String[] args) {
        char[] array = {'E', 's', 's', 'a'};
        System.out.println(Q133.charToString(array));
    }

    public static String charToString(char[] array) {
        String concatenated = "";
        for (int i = 0; i < array.length; i++){
            concatenated+=array[i];
        }
        return concatenated; //  return new String(array); that code is the better way
    }
}
