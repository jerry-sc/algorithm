package round2;

/**
 * Created on 2018-01-26
 *
 * @author Jerry Shen
 */
public class P530 {

    private int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        postOrder(root);
        return min;
    }

    private void postOrder(TreeNode root) {
        if (root == null)   return;
        int left = findMax(root.left);
        int right = findMin(root.right);
        if (left != -1 && right == -1)  min = Math.min(min, root.val - left);
        if (left == -1 && right != -1) min = Math.min(min, right - root.val);
        if (left != -1 && right != -1) min = Math.min(min, Math.min(root.val - left, right - root.val));
        postOrder(root.left);
        postOrder(root.right);
    }

    private int findMax(TreeNode root) {
        if (root == null) return -1;
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }

    private int findMin(TreeNode root) {
        if (root == null) return -1;
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }

}
