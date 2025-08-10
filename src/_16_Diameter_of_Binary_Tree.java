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

public class _16_Diameter_of_Binary_Tree {
    int diameter = 0;

    // Method to return the diameter
    public int diameterOfBinaryTree(TreeNode03 root) {
        depth(root);
        return diameter;
    }

    // Helper to compute depth
    private int depth(TreeNode03 node) {
        if (node == null) return 0;

        int left = depth(node.left);
        int right = depth(node.right);

        // Update diameter: path through this node
        diameter = Math.max(diameter, left + right);

        // Return height of subtree
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        // Constructing the binary tree: [3,9,20,null,null,15,7]
        TreeNode03 root = new TreeNode03(1);
        root.left = new TreeNode03(2,new TreeNode03(4),new TreeNode03(5));
        root.right = new TreeNode03(3,new TreeNode03(66),new TreeNode03(4));

        _16_Diameter_of_Binary_Tree solution = new _16_Diameter_of_Binary_Tree();
        int result = solution.diameterOfBinaryTree(root);

        System.out.println("Diameter of Tree: " + result);  // Output: 3
    }
}

