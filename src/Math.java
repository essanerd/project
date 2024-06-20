public class  Math {
    public static void main(String[] args) {
        int solve = java.lang.Math.round(1.1F);
        System.out.println(solve);

        int result = (int) java.lang.Math.ceil(1.1);
        System.out.println(result);

        int divide = (int) java.lang.Math.floor(1.1);
        System.out.println(divide);

        int multiply = (int) java.lang.Math.max(1, 2);
        System.out.println(multiply);


        double subtract = java.lang.Math.min(1, 2);
        System.out.println(subtract);

        // Math.random generates a random number between 0 and 1
        double add = java.lang.Math.random();
        System.out.println(add);

        // Example of converting random number into a 3 digit decimal number
        System.out.println("using Math.random * 1000");
        double strategy = java.lang.Math.random() * 1000;
        System.out.println(strategy);

        // Example of converting random number into a 2 digit decimal
        System.out.println("using Math.random * 100");
        double strategy2 = java.lang.Math.random() * 100;
        System.out.println(strategy2);

        // Example of converting random number into a 1 digit decimal
        System.out.println("using Math.random * 10");
        double strategy3 = java.lang.Math.random() * 10;
        System.out.println(strategy3);


        int nice = (int) java.lang.Math.round(java.lang.Math.random() * 100);
        System.out.println(nice);

        int kaka = (int) (java.lang.Math.random() * 100);
        System.out.println(kaka);


        int fact = (int) (java.lang.Math.random() * 100);
        System.out.println(fact);
    }
}

