package Graphs;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class LeafSimilarTrees {
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList();
        List<Integer> l2=new ArrayList();
        dfs(root1,l1);
        dfs(root2,l2);
        return l1.equals(l2);
    }
    public void dfs(TreeNode node,List<Integer> lv){
        if(node!=null){
            if(node.left==null&&node.right==null) lv.add(node.val);
            dfs(node.left,lv);
            dfs(node.right,lv);
        }
    }
}

