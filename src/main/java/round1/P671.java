package round1;

import tree.TreeNode;

public class P671 {

    int secondMin = -1;

    public int findSecondMinimumValue(TreeNode root) {
        order(root, root.val);
        return secondMin;
    }

    private void order(TreeNode root, int value) {
        if (root.left != null) {
            if (root.left.val == value) {
                order(root.left, value);
            } else {
                if (secondMin == -1)
                    secondMin = root.left.val;
                else
                    secondMin = Math.min(secondMin, root.left.val);
            }
        }
        if (root.right != null) {
            if (root.right.val == value) {
                order(root.right, value);
            } else {
                if (secondMin == -1)
                    secondMin = root.right.val;
                else
                    secondMin = Math.min(secondMin, root.right.val);
            }
        }
    }
}
