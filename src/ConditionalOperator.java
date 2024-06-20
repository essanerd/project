import java.awt.font.LineMetrics;

public class ConditionalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        int max = a > b ? a : b;
        System.out.println(max);

        int c = 20;
        int d = 30;

        int result = java.lang.Math.max(c, d);
        System.out.println(result);


        int e = 10000;
        int f = 1000;

        if (e > f) {
            System.out.println(e);

        } else
            System.out.println(f);
        }
    }


