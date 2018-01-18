package round2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created on 2018-01-18
 *
 * @author Jerry Shen
 */
public class P637 {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        res.add((double) root.val);
        while (!queue.isEmpty()) {
            List<TreeNode> list = new ArrayList<>();
            double sum = 0;
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    list.add(node.left);
                    sum += node.left.val;
                }
                if (node.right != null) {
                    list.add(node.right);
                    sum += node.right.val;
                }
            }
            if (list.size() != 0) {
                res.add(sum / list.size());
                queue.addAll(list);
            }
        }
        return res;
    }
}
