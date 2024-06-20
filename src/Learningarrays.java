import java.util.Arrays;

public class  Learningarrays
{
    public static void main(String[] args) {
        int[] numbers=new int[5];
        numbers [0]=1;
        numbers [1]=2;
        System.out.println( Arrays.toString(numbers));

        int [] people ={2,3,5,1,4};
        int length = numbers.length;
        System.out.println(numbers.length);

        int [] messages ={2,3,4,1,5};
        Arrays.sort (messages);
        System.out.println(Arrays.toString(messages));
    }
}
