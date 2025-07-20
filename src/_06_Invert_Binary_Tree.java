public class _06_Invert_Binary_Tree {
    /**
     * Definition for a binary tree node.
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * Solution class with invertTree method.
     */
    public static class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) return null;

            TreeNode temp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(temp);

            return root;
        }
    }

    public static void main(String[] args) {

    }
}
