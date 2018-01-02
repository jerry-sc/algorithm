package leetcode;

import tree.TreeNode;

public class P110 {

    boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return flag;
    }

    private int dfs(TreeNode root) {
        if (root == null)
            return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        if (Math.abs(left - right) >= 2)
            flag =false;
        return Math.max(left, right) + 1;
    }
}
