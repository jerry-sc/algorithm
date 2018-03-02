package round2;

public class P111 {

    int min = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        dfs(root, 0);
        return min;
    }

    private void dfs(TreeNode root, int depth) {
        if (root == null) return;
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
        if (root.left == null && root.right == null) min = Math.min(min, depth+1);
    }
}
