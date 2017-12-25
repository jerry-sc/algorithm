package leetcode;

import tree.TreeNode;

/**
 * Created on 2017-12-25
 *
 * @author Jerry Shen
 */
public class P404 {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;

        int left = sumOfLeftLeaves(root.left);
        int right = sumOfLeftLeaves(root.right);
        if (root.left == null && root.right == null) {
            return root.val;
        }

        return left + right;
    }
}
