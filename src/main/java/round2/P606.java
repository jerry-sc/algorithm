package round2;

/**
 * Created on 2018-01-22
 *
 * @author Jerry Shen
 */
public class P606 {

    public String tree2str(TreeNode t) {
        String res = preOrder(t);
        return res.substring(1, res.length() - 1);
    }

    private String preOrder(TreeNode t) {
        if (t == null) {
            return "()";
        }
        String res = "(" + t.val;
        String left = preOrder(t.left);
        String right = preOrder(t.right);
        if (left.equals("()")) {
            if (!right.equals("()")) {
                res += ("()" + right);
            }
        } else {
            res += left;
            if (!right.equals("()")) {
                res += right;
            }
        }
        return res + ")";
    }

}
