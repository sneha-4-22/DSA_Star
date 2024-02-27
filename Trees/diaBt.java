


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class diaBt {

    int maxDiameter = 0;

    public int dfs(TreeNode node) {
        if(node == null) return 0;

        int leftDepth = dfs(node.left);
        int rightDepth = dfs(node.right);
        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);

        return Math.max(leftDepth , rightDepth) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxDiameter;
    }

    public static void main(String[] args) {
        // Create a binary tree for testing
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        diaBt solution = new diaBt();
        System.out.println("Diameter of the binary tree: " + solution.diameterOfBinaryTree(root));
    }
}
