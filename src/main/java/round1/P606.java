package round1;

import tree.TreeNode;

/**
 * Created on 2017-12-25
 *
 * @author Jerry Shen
 */
public class P606 {

    public String tree2str(TreeNode t) {
        StringBuilder builder = new StringBuilder();
        preOrder(t, builder);
        return builder.substring(1, builder.length() - 1);
    }

    private void preOrder(TreeNode root, StringBuilder builder) {
        if (root == null) {
            builder.append("()");
            return;
        }
        builder.append("(").append(root.val);
        preOrder(root.left, builder);
        preOrder(root.right, builder);
        if (root.right == null) {
            builder.setLength(builder.length() - 2);
            if (root.left == null) {
                builder.setLength(builder.length() - 2);
            }
        }
        builder.append(")");
    }
}
