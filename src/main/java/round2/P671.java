package round2;

/**
 * Created on 2018-01-31
 *
 * @author Jerry Shen
 */
public class P671 {

    private int first;

    public int findSecondMinimumValue(TreeNode root) {
        this.first = root.val;
        int res =  preOrder(root);
        return first == res ? -1 : res;
    }

    private int preOrder(TreeNode root) {
        if (root == null) return -1;
        if (root.val != first)  return root.val;
        int left = preOrder(root.left);
        int right = preOrder(root.right);
        if (left != -1) {
            if (left != first && right != first)
                return Math.min(left,right);
            else return Math.max(left,right);
        }
        return root.val;
    }


}
