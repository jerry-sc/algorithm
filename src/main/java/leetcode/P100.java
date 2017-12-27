package leetcode;

import tree.TreeNode;

public class P100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (!((p == null && q == null) || (p!=null && q!=null && p.val == q.val)))
            return false;
        if (p == null)
            return true;
        boolean left =  isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);
        return left && right;
    }

}
