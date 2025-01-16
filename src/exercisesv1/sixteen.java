package exercisesv1;

public class sixteen {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 4, 8, 2, 30};
        int firsNum = array1[0];
        int secondNum = array1[array1.length/2];
        int thirdNum = array1[array1.length-1];
        if (firsNum > secondNum && firsNum > thirdNum){
            System.out.println(firsNum);
        }

        if (firsNum < secondNum && secondNum > thirdNum){
            System.out.println(secondNum);
        }
        System.out.println(thirdNum);
        }
    }

