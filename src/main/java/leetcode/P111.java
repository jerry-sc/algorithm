package leetcode;

import tree.TreeNode;

public class P111 {

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = minDepth(root.left) + 1;
        int right = minDepth(root.right) + 1;
        if (left == 1 && right == 1)
            return 1;
        if (left == 1 || right == 1)
            return Math.max(left, right);
        else
            return Math.min(left, right);
    }

}
