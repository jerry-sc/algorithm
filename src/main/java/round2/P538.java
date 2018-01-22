package round2;

/**
 * Created on 2018-01-22
 *
 * @author Jerry Shen
 */
public class P538 {

    private TreeNode pre;

    public TreeNode convertBST(TreeNode root) {
        if (root == null)   return null;
        convertBST(root.right);
        if (pre != null) {
            root.val += pre.val;
        }
        pre = root;
        convertBST(root.left);
        return root;
    }
}
