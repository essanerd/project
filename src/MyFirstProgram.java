import java.util.Date;

public class MyFirstProgram {
    public static void main(String[] args) {
        // Example of printing a literal string using sout
        System.out.println("hello world");

        // Example of printing a value of a variable instead of hardcoded literal string
        int age = 30;
        System.out.println(age);

        // Examples of Primitive Data types
        Byte age1 = 30;
        long viewscount = 3_123_456_789L;
        float price = 10.99F;
        char letters = 'A';
        boolean iseligible = false;

        // examples of reference types
        byte age2 = 25;
        Date now = new Date();
        System.out.println(now);
    }
}
