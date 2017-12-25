package leetcode;

import tree.TreeNode;

/**
 * Created on 2017-12-25
 *
 * @author Jerry Shen
 */
public class P104 {

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int left = maxDepth(root.left) + 1;
        int right = maxDepth(root.right) + 1;
        return Math.max(left, right);
    }
}
