package round1;

import tree.TreeNode;

import java.util.*;

/**
 * Created on 2017-12-25
 *
 * @author Jerry Shen
 */
public class P637 {

    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> res = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            double sum = 0;
            int count = 0;
            Queue<TreeNode> temp = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                ++count;
                sum += node.val;
                if (node.right != null)
                    temp.add(node.right);
                if (node.left !=null)
                    temp.add(node.left);
            }
            queue.addAll(temp);
            res.add(sum / count);
        }
        return res;
    }

}
