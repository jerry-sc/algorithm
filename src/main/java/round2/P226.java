package round2;

/**
 * Created on 2018-01-18
 *
 * @author Jerry Shen
 */
public class P226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null)   return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.right = left;
        root.left = right;
        return root;
    }
}
