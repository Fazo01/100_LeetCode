public class _13_Majority_Element {
    public int majorityElement(int[] nums){
        int majority=nums[0];
        int votes=0;
        for(int i=0;i< nums.length;i++){
            if(votes==0){
                votes++;
                majority=nums[i];
            }else if(majority==nums[i]){
                votes++;
            }else {
                votes--;
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        _13_Majority_Element solution = new _13_Majority_Element();

        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Element in nums1: " + solution.majorityElement(nums1)); // Output: 3
        System.out.println("Majority Element in nums2: " + solution.majorityElement(nums2)); // Output: 2
    }

}
