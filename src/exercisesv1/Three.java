package exercisesv1;

public class Three {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println();
        } else if (i%5==0) {
                System.out.println(i);
            } else if (i%3==0) {
                System.out.println(i);
            }
        }
}}
