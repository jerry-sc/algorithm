package round2;

/**
 * Created on 2018-01-24
 *
 * @author Jerry Shen
 */
public class P404 {

    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        postOrder(root);
        return sum;
    }

    private boolean postOrder(TreeNode root) {
        if (root == null)   return true;
        boolean left = postOrder(root.left);
        if (left && root.left != null) {
            sum += root.left.val;
        }
        postOrder(root.right);
        return root.left == null && root.right == null;
    }
}
