package round2;

public class P437 {

    private int goal;

    private int res = 0;

    public int pathSum(TreeNode root, int sum) {
        goal = sum;
        count(root);
        return res;
    }

    private void count(TreeNode root) {
        if (root == null)   return;
        preOrder(root, 0);
        count(root.left);
        count(root.right);
    }

    private void preOrder(TreeNode root, int total) {
        if (root.left == null && root.right == null) {
            if (total + root.val == goal) ++res;
        }
        if (root.left != null)  preOrder(root.left, total + root.val);
        if (root.right != null)  preOrder(root.right, total + root.val);
    }
}
