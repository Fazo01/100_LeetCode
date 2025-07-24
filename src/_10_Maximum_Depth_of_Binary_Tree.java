// TreeNode class definition
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class _10_Maximum_Depth_of_Binary_Tree {

    // Recursive DFS function to find max depth
    public static int maxDepth(TreeNode root) {

    }

    public static void main(String[] args) {
        // Constructing the tree: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Find and print max depth
        int result = maxDepth(root);
        System.out.println("Maximum depth of the binary tree is: " + result);
    }
}

