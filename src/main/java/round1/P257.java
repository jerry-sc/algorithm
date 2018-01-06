package round1;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null)
            return res;
        Stack<String> stringStack = new Stack<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        stringStack.add(root.val + "");
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left == null && node.right == null) { // leaf node
                res.add(stringStack.pop());
                continue;
            }
            String prefix = stringStack.pop();
            if (node.right != null) {
                stack.add(node.right);
                stringStack.add(prefix + "->" + node.right.val);
            }
            if (node.left != null) {
                stack.add(node.left);
                stringStack.add(prefix + "->" + node.left.val);
            }
        }
        return res;
    }
}
