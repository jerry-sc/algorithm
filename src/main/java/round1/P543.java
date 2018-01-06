package round1;

import tree.TreeNode;

public class P543 {

    int sum = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        postOrder(root);
        return sum;
    }

    private int postOrder(TreeNode root) {
        if (root == null)
            return 0;
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        if (left + right > sum)
            sum = left + right;
        return Math.max(left, right) + 1;
    }
}
