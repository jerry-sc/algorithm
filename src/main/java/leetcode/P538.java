package leetcode;

import tree.TreeNode;

/**
 * Created on 2017-12-25
 *
 * @author Jerry Shen
 */
public class P538 {

    private TreeNode prev = null;

    public TreeNode convertBST(TreeNode root) {
        inOrder(root);
        return root;
    }

    private void inOrder(TreeNode root) {
        if (root == null)
            return;
        inOrder(root.right);
        if (prev != null)
            root.val += prev.val;
        prev =  root;
        inOrder(root.left);
    }
}
