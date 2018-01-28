package round2;

/**
 * Created on 2018-01-28
 *
 * @author Jerry Shen
 */
public class P543 {

    private int max = -1;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)   return 0;
        postOrder(root);
        return max;
    }

    private int postOrder(TreeNode root) {
        if (root == null)   return 0;
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        int length = left+right;
        max = Math.max(max, length);
        return Math.max(left, right) + 1;
    }
}
