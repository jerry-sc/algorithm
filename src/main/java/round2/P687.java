package round2;

public class P687 {

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;
        return Math.max(dfs(root.left, root.val) + dfs(root.right, root.val), Math.max(longestUnivaluePath(root.left), longestUnivaluePath(root.right)));
    }

    private int dfs(TreeNode root, int lastVal) {
        if (root == null || root.val != lastVal) return 0;
        int left = dfs(root.left, root.val);
        int right = dfs(root.right, root.val);
        return Math.max(left, right) + 1;
    }
}
