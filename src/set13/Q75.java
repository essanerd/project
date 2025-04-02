package set13;

public class Q75 {
    public static void main(String[] args) {
        System.out.println("for loop");
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println("-------------------------------------");
        System.out.println("while loop");

        int sum2 = 0;
        int i2 = 1;
        while (i2 < 10){
            sum2 = sum2 + i2;
            i2++;
        }
        System.out.println(sum2);
        System.out.println("----------------------------------------");
        System.out.println("do-while loop");
        int i3 = 1;
        int sum3 = 0;
        do {
            sum3 = sum3 + i3;
            i3++;
        }while (i3 < 10);
        System.out.println(sum3);
    }
}
