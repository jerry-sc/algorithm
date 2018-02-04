package round2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2018-02-04
 *
 * @author Jerry Shen
 */
public class P257 {

    private List<String> res = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        inOrder(root, "");
        return res;
    }

    private String inOrder(TreeNode root, String prefix) {
        if (root == null) return "";
        String left = inOrder(root.left, prefix + "->" + root.val);
        String right = inOrder(root.right, prefix + "->" + root.val);
        if (left.equals("") && right.equals("")) { // leaf node
            res.add((prefix + "->" + root.val).substring(2));
        }
        return prefix;
    }
}
