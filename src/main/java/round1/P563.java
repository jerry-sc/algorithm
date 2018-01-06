package round1;

import tree.TreeNode;



public class P563 {

    private int sum = 0;

    public int findTilt(TreeNode root) {
        postOrder(root);
        return sum;
    }

    private int postOrder(TreeNode root) {
        if (root == null)
            return 0;
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        sum += Math.abs(left - right);
        return root.val + left + right;
    }
}
