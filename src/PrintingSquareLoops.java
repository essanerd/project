public class PrintingSquareLoops {
    public static void main(String[] args) {
        for (int i = 1; i<= 5; i++) {// printing 5 blank line
            System.out.println();

            for (int s= 1; s<=i; s++) {// relationship between s and I s<=5-i s++
                System.out.print("");

            }
            for (int j = 0;j<=4; j++) {// relationship between j and I is j<=i*2-1
                System.out.print(" * ");
            }

        }
    }
}