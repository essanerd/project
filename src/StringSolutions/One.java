package StringSolutions;

public class One
{
    public String conCat(String s1, String s2)
    {
        if (s1.length() != 0 && s2.length() != 0 && s1.charAt(s1.length() - 1) == s2.charAt(0))
            return s1 + s2.substring(1);
        return s1 + s2;
    }

    public static void main (String[] args)
    {
        One m= new One();
        String str1 = "Mark";
        String str2 = "Kate";
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();
        System.out.println("String : "+s1+"  and  "+s2);
        System.out.println("String After Concatination are: "+m.conCat(s1,s2));
    }
}