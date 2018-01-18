package round2;

/**
 * Created on 2018-01-18
 *
 * @author Jerry Shen
 */
public class P104 {

    public int maxDepth(TreeNode root) {
        if (root == null)   return 0;
        int left = maxDepth(root.left) + 1;
        int right = maxDepth(root.right) + 1;
        return Math.max(left, right);
    }
}
