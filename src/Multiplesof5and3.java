public class Multiplesof5and3 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 3, 4, 15, 25, 6, 8, 10};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 5 == 0 && nums[i] % 3 == 0) {
                System.out.println(nums[i]);
            }
        }
    }
}