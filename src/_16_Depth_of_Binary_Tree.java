
// Definition for a binary tree node.
class TreeNode03 {
    int val;
    TreeNode03 left;
    TreeNode03 right;

    TreeNode03() {}
    TreeNode03(int val) { this.val = val; }
    TreeNode03(int val, TreeNode03 left, TreeNode03 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class _16_Depth_of_Binary_Tree {
    //brute force

    public int maxDepth(TreeNode03 root) {
        if(root==null) return 0;
        int leftside=maxDepth(root.left);
        int rightside=maxDepth(root.right);
        return Math.max(leftside,rightside)+1;
    }
    public static void main(String[] args) {
        // Constructing the binary tree: [3,9,20,null,null,15,7]
        TreeNode03 root = new TreeNode03(3);
        root.left = new TreeNode03(9);
        root.right = new TreeNode03(20, new TreeNode03(15), new TreeNode03(7));

        _16_Depth_of_Binary_Tree solution = new _16_Depth_of_Binary_Tree();
        int result = solution.maxDepth(root);

        System.out.println("Maximum depth: " + result);  // Output: 3
    }

}
