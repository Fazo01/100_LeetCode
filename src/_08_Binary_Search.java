public class _08_Binary_Search {
    public static int search(int[] nums,int target){
        int left=0;
        int right= nums.length-1;
        while (left<right){
            int mid=(left+right)/2;
            if(nums[mid]==target)return mid;
            if (target>nums[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;
        System.out.println("Index of target " + target1 + " is: " + search(nums1, target1)); // Output: 4

        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 2;
        System.out.println("Index of target " + target2 + " is: " + search(nums2, target2)); // Output: -1

    }
}
