package set16;

public class Q125 {
    public static void main(String[] args) {
        int number = 4;
        System.out.println(Q125.isItEven(number));
        System.out.println(Q125.isEven(number));

    }
    public static String isItEven(int number){
        return (number % 2 == 0) ? "true" : "false";
    }
    public static boolean isEven(int number) {
        return number % 2 == 0; // better way
    }
}
