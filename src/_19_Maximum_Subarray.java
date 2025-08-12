public class _19_Maximum_Subarray {
    public static int maxSubArray(int[] nums) {

    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1};
        int[] nums3 = {5, 4, -1, 7, 8};

        System.out.println("Max Subarray Sum 1: " + maxSubArray(nums1)); // 6
        System.out.println("Max Subarray Sum 2: " + maxSubArray(nums2)); // 1
        System.out.println("Max Subarray Sum 3: " + maxSubArray(nums3)); // 23
    }


}
