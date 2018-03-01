package round2;

public class P110 {

    boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        postOrder(root);
        return flag;
    }

    private int postOrder(TreeNode root) {
        if (root == null)   return 0;
        int left = postOrder(root.left) + 1;
        int right = postOrder(root.right) + 1;
        if (Math.abs(left -  right) > 1) flag = false;
        return Math.max(left, right);
    }

}
