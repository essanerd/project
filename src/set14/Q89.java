package set14;

public class Q89 {
    public static void main(String[] args) {
        String s = "Alex";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse().toString().toUpperCase());


        String s2 = " Essa ";
        String updatedValue = s2.toUpperCase().trim();

        System.out.println(updatedValue);
        System.out.println(s2.toUpperCase().trim());
        System.out.println(s2);




    }
}
