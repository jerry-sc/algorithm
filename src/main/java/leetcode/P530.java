package leetcode;

import tree.TreeNode;

public class P530 {

    int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        order(root);
        return min;
    }

    private void order(TreeNode root) {
        if (root == null)
            return;
        TreeNode left = getLeftMax(root.left);
        TreeNode right = getRightMin(root.right);
        if (left != null)
            min =  Math.min(min, Math.abs(root.val - left.val));
        if (right != null)
            min = Math.min(min, Math.abs(root.val - right.val));
        order(root.left);
        order(root.right);
    }

    private TreeNode getLeftMax(TreeNode root) {
        if (root == null)
            return null;
        while (root.right != null)
            root = root.right;
        return root;
    }

    private TreeNode getRightMin(TreeNode root) {
        if (root == null)
            return null;
        while (root.left != null)
            root = root.left;
        return root;
    }
}
