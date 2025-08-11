public class TreeNode05 {
    int val;
    TreeNode05 left;
    TreeNode05 right;
    TreeNode05() {}
        TreeNode05(int val) {
            this.val = val;
        }
        TreeNode05(int val, TreeNode05 left, TreeNode05 right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
}
public class _18_Converted_Sorted_array_to_Binary_Search_Tree {
    public TreeNode05 sortedArraytoBST(int[] nums){
        if (nums.length==0) return null;
        return getBST(nums,0,nums.length-1);

    }
    public TreeNode05 getBST(int[] nums,int startIdx,int endIdx){
        if (startIdx>endIdx)return null;
        int middleidx=(startIdx+endIdx)/2;
        TreeNode05 bst=new TreeNode05(nums[middleidx]);
        bst.left=getBST(nums,startIdx,middleidx-1);
        bst.right=getBST(nums,middleidx+1,endIdx);
        return bst;

    }
}