public class _14_Missing_Number {
    // Brute force solution
    public int missingNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<=n;i++){
            boolean found=false;
            for(int j=0;j<n;j++){
                if (nums[j]==i){
                    found=true;
                    break;
                }
            }
            if (!found){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        _14_Missing_Number solution = new _14_Missing_Number();
        int[] nums1 = {3, 0, 1};
        int[] nums2 = {0, 1};
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println("Output of nums1: " + solution.missingNumber(nums1)); // Expected: 2
        System.out.println("Output of nums2: " + solution.missingNumber(nums2)); // Expected: 2
        System.out.println("Output of nums3: " + solution.missingNumber(nums3)); // Expected: 8
    }
}
