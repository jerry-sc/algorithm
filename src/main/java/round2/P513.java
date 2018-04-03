package round2;

public class P513 {

    private int res;
    private int maxDepth = -1;

    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode root, int depth) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            if (depth > maxDepth) {
                res = root.val;
                maxDepth = depth;
            }
            return;
        }
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
