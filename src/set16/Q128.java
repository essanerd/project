package set16;

public class Q128 {
    public static void main(String[] args) {
        String string = "Essa is coding";
        Q128.eachCharecter(string);
    }

    public static void eachCharecter(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }

    }
}
