package StringSolutions;

public class Nine {
    public static void main(String[] args)
    {
        String str1 = "Tutor Joes";
        String str2 = "Computer Education";
        CharSequence cs = "Tutor Joes";
        System.out.println("Comparing '"+str1+"'"+" and '"+cs+"' : " + str1.contentEquals(cs));
        System.out.println("Comparing '"+str2+"'"+" and '"+cs+"' :"+ str2.contentEquals(cs));
    }
}
