public class  Foreachloop {
    public static void main(String[] args) {
        String[] fruits = {"apple, mango, orange"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        int i = 0;
        while(i < fruits.length){
            System.out.println(fruits[i]);
            i++;
        }

    }
}