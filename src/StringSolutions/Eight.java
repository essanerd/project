package StringSolutions;

public class Eight {

    public  static void main(String[] args)
    {
        String str1 = "Tutor Joe's Computer Educations";
        String str2 = "Computer";
        String str3 = "Computers";
        System.out.println("Given String : " + str1);
        System.out.println("Specified Sequence of char Values : " + str2);
        System.out.println(str1.contains(str2));
        System.out.println("\nSpecified Sequence of char Values : " + str3);
        System.out.println(str1.contains(str3));

    }
}
