package round2;

public class P783 {

    private TreeNode prev = null;

    private int min = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        return min;
    }

    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        if (prev != null) {
            if (Math.abs(prev.val - root.val) < min)
                min = Math.abs(prev.val - root.val);
        }
        prev = root;
        inOrder(root.right);
    }
}
