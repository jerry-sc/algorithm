package round2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created on 2018-01-22
 *
 * @author Jerry Shen
 */
public class P653 {

    private Set<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        return preOrder(root, k);
    }

    private boolean preOrder(TreeNode root, int k) {
        if (root==null) return false;
        if (set.contains( k - root.val))    return true;
        set.add(root.val);
        return preOrder(root.left, k) || preOrder(root.right, k);
    }

}
