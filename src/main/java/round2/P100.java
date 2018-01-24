package round2;

/**
 * Created on 2018-01-24
 *
 * @author Jerry Shen
 */
public class P100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return p == null && q == null || !((p == null && q != null) || (p != null && q == null)) && p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
