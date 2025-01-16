package StringSolutions;

public class Ten {
    public static void main(String[] args)
    {
        String str1 = "Tutor Joes";
        String str2 = "Computer Education";
        StringBuffer buffer = new StringBuffer(str1);

        System.out.println("Comparing '"+str1+"'"+" and '"+buffer+"' : "+ str1.contentEquals(buffer));
        System.out.println("Comparing '"+str2+"'"+" and '"+buffer+"' : "+ str2.contentEquals(buffer));
    }
}
