import java.util.Arrays;

public class OddBeforeEven {
    public static void main(String[] args) {
        int[]nums = {1,2,4,5,7,9-2,3};

        int[] temp =new int [nums.length];

        int j =0;
        int k = nums.length - 1;
        for (int i =0 ; i< nums.length; i++)
            if (nums[i] % 2 != 0)
                temp[j++] = nums[i];
        else
            temp[k--]= nums[i];

        copyarray(temp,nums);
        System.out.println(Arrays.toString(nums));
    }
     private static void copyarray(int[] temp,int[]nums ){
        for (int i = 0; i < temp.length; i++)
            nums[i] = temp[i];
     }
}
