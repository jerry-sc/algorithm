package round1;

import tree.TreeNode;

public class P101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return compare(root.left, root.right);
    }

    private boolean compare(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode != null && rightNode == null || (leftNode == null && rightNode != null) || (leftNode != null && rightNode != null && leftNode.val != rightNode.val))
            return false;
        if (leftNode == null)
            return true;
        return compare(leftNode.left, rightNode.right) && compare(leftNode.right, rightNode.left);
    }

}
