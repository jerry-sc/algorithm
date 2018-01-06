package round1;

import tree.TreeNode;

import java.util.HashSet;
import java.util.Set;


/**
 * Created on 2017-12-25
 *
 * @author Jerry Shen
 */
public class P404 {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        Set<TreeNode> set = new HashSet<>();
        postOrder(root, set);
        postOrderAgain(root, set);
        int sum = 0;
        for (TreeNode node : set) {
            sum += node.val;
        }
        return sum;
    }

    private void postOrderAgain(TreeNode root, Set<TreeNode> set) {
        if (root == null)
            return;
        if (set.contains(root.right))
            set.remove(root.right);
        postOrderAgain(root.left, set);
        postOrderAgain(root.right, set);
    }

    private void postOrder(TreeNode root, Set<TreeNode> set) {
        if (root == null)
            return;
        postOrder(root.left, set);
        postOrder(root.right, set);
        if (root.left == null && root.right == null)
            set.add(root); // add leaf node
    }
}
