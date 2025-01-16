package StringSolutions;

public class Six {
    public static void main(String[] args)
    {
        String str1 = "Tutor Joe's ";
        String str2 = "Computer Educations";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        String str3 = str1.concat(str2);
        System.out.println("Concatenated string: " + str3);
    }
}
