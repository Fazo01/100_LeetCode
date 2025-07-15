import java.util.HashMap;

public class _01_Two_Sum {
    public static int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i< nums.length;i++){
            int num=nums[i];
            int remNo=target-num;
            if(map.containsKey(remNo)){


                return new int[]{map.get(remNo),i};
            }
            map.put(num,i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");

    }
}