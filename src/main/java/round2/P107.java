package round2;

import java.util.*;

/**
 * Created on 2018-02-02
 *
 * @author Jerry Shen
 */
public class P107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            List<TreeNode> nodes = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
            }
            res.add(tmp);
            queue.addAll(nodes);
        }
        Collections.reverse(res);
        return res;
    }
}
