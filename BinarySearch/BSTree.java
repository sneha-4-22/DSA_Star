package BinarySearch;

public class BSTree {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode ans = new TreeNode();
        if(root==null) return null;
        if(root.val==val) return root;
        if(root.val>val) ans=searchBST(root.left,val);
        else ans=searchBST(root.right,val);
        return ans;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
        }
    }
}
