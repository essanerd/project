public class ReversingCharecters {
    public static void main(String[] args) {
        String string =  "hey bro";
        for (int i =  string.length() - 1 ; i>= 0; i--) {
            System.out.print(string.charAt(i));
    }
}}