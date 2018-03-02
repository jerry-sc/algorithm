package round2;

/**
 * Created on 2018-03-02
 *
 * @author Jerry Shen
 */
public class P103 {
    private int given;
    private boolean flag = false;

    public boolean hasPathSum(TreeNode root, int sum) {
        given = sum;
        dfs(root, 0);
        return flag;
    }

    private void dfs(TreeNode root, int cur) {
        if (root == null)   return;
        if (root.left == null && root.right == null) {
            if (cur + root.val == given) {
                flag = true;
                return;
            }
        }
        dfs(root.left, cur + root.val);
        dfs(root.right, cur + root.val);

    }
}
