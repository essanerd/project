package set16;

public class Q127 {
    public static void main(String[] args) {
        String string1 = "Essa";
        String string2 = "Ahmed";
        System.out.println(Q127.stringsConcatenated(string1,string2));
    }
    public static String stringsConcatenated(String string1, String string2){
        return string1+=string2;
    }
}
