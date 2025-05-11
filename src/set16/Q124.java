package set16;

public class Q124 {
    public static void main(String[] args) {
        char constanant = 'a';
        System.out.println(Q124.constanantOrVovel(constanant));
    }

    public static String constanantOrVovel(char constanant) {
        if (constanant == 'a' || constanant == 'e' || constanant == 'i'
                || constanant == 'o' || constanant == 'u') {
            return "Vowel";
        }

        return "consonant";
    }
}
