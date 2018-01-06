package round1;

import tree.TreeNode;

public class P687 {

    private int ans;

    public int longestUnivaluePath(TreeNode root) {
        ans = 0;
        postOrder(root);
        return ans;
    }

    private int postOrder(TreeNode root) {
        if (root == null)
            return 0;
        int a = postOrder(root.left);
        int b = postOrder(root.right);
        int left = 0, right = 0;
        if (root.left != null && root.left.val == root.val) {
            left += a +1;
        }
        if (root.right != null && root.right.val == root.val) {
            right += b + 1;
        }
        ans = Math.max(ans, left + right);
        return Math.max(left, right);
    }
}
