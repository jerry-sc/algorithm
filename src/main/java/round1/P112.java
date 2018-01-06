package round1;

import tree.TreeNode;

public class P112 {

    boolean flag = false;

    int total;

    public boolean hasPathSum(TreeNode root, int sum) {
        total =  sum;
        dfs(root, 0);
        return flag;
    }

    private void dfs(TreeNode root, int sum) {
        if (root == null)
            return;
        sum += root.val;
        dfs(root.left, sum);
        dfs(root.right, sum);
        if (root.left == null && root.right == null) {
            if (total == sum)
                flag = true;
        }
    }
}
