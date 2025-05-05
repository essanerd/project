package set16;

public class Q115 {
    public static void main(String[] args) {
        oneToTen();
    }
    public  static int oneToTen(){
        int number = (int) java.lang.Math.round(java.lang.Math.random() * 10);
        System.out.println(number);
        return number;
    }
}
