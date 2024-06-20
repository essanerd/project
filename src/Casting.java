public class Casting {
    public static void main(String[] args) {
       // implicit casting
        short x =1;
        int y=x +2;
        System.out.println(y);

//byte > short > int > Long > float > double
//if changed to int you'll see a compilation error.
        double r  = 1.1;
        double t = r+2;
        System.out.println(t);


        double e =1.1;
        int w =(int) e +2;
        System.out.println(w);


//if  string b changed  to float you will get an error      
        String b= "1";
        int n = Integer.parseInt(b) + 2;
        System.out.println(n);


        int pd = 2;
        short ss = (short) pd;
    }
}