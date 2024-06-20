import java.util.Locale;

public class examples {
    public static void main(String[] args) {
        String message = "hello world"+"!!"
        ;
        System.out. println(message.endsWith("!!"));

        System.out.println(message.startsWith("hello"));

        System.out.println(message.length());

        System.out.println(message.indexOf("e"));

        System.out.println(message.replace("!", "*" ));
        System.out.println(message);

        System.out.println(message.toLowerCase());
        System.out.println(message );

        System.out.println(message.trim());
        System.out.println(message);

        System.out.println(message.toUpperCase());
        System.out.println(message);
    }
}
