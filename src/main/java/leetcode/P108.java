package leetcode;

import tree.TreeNode;

/**
 * Created on 2017-12-29
 *
 * @author Jerry Shen
 */
public class P108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length-1);
    }

    private TreeNode build(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode newNode = new TreeNode(nums[mid]);
        newNode.left = build(nums, left, mid-1);
        newNode.right = build(nums, mid + 1, right);
        return newNode;
    }
}
