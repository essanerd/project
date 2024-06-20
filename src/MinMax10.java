public class MinMax10 {
    public static void main(String[] args) {
        int[]nums={2,4,6,-3,5};
        int min =nums [0];
        int max=nums[0];
        for (int i =1; i<nums.length; i++){
            max = (nums[i] > max) ? nums[i]: max;
            min = (nums[i] < min) ? nums[i] : max;
        }
    }
}
