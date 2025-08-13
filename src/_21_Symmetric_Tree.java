public class _21_Symmetric_Tree {
    public boolean isSymmetric(TreeNode05 root){
        return root == null || isMirror(root.left,root.right);
    }
    public boolean isMirror(TreeNode05 left , TreeNode05 right){
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        return (left.val==right.val) && isMirror(left.left,right.right) && isMirror(left.right,right.left);
    }
}
