package exercisesv1;

public class Ten {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};

        int[] nums2 = {1, 2, 3, 4, 6,};
        if (nums1[0] ==nums2[0]&&nums1[nums1.length-1]==nums2[nums2.length-1])
            System.out.println("true");
        else
            System.out.println("false");
    }
}
