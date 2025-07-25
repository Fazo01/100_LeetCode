public class _11_Single_Number {
    public static int singleNumber(int[] nums) {
        int result=0;
        for (int bit:nums){
            result=result^bit;
        }
        return result;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        System.out.println("Single number in nums1: " + singleNumber(nums1)); // Output: 1
        System.out.println("Single number in nums2: " + singleNumber(nums2)); // Output: 4
        System.out.println("Single number in nums3: " + singleNumber(nums3)); // Output: 1
    }

}
