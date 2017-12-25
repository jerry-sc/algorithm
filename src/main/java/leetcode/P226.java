package leetcode;

import tree.TreeNode;

/**
 * Created on 2017-12-25
 *
 * @author Jerry Shen
 */
public class P226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}
