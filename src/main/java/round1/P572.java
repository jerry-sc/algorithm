package round1;

import tree.TreeNode;

public class P572 {

    private TreeNode origin;

    public boolean isSubtree(TreeNode s, TreeNode t) {
        origin = t;
        return order(s, t);
    }

    private boolean order(TreeNode s, TreeNode t) {
        if (s == null && t == null)
            return true;
        if (s == null || t == null)
            return false;
        if (s.val != t.val) {
            return order(s.left, origin) || order(s.right, origin);
        } else {
            return equals(s, t) || order(s.left, origin) || order(s.right, origin);
        }
    }

    private boolean equals(TreeNode x,TreeNode y)
    {
        if(x==null && y==null)
            return true;
        if(x==null || y==null)
            return false;
        return x.val==y.val && equals(x.left,y.left) && equals(x.right,y.right);
    }
}
