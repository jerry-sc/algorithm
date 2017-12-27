package leetcode;

import tree.TreeNode;

import java.util.List;

public class P437 {

    int sum = 0;

    public int pathSum(TreeNode root, int sum) {

    }

    private void postOrder(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.val);
        for (int i : list) {

        }
    }
}
