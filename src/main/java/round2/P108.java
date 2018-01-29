package round2;

/**
 * Created on 2018-01-29
 *
 * @author Jerry Shen
 */
public class P108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return create(nums, 0, nums.length-1);
    }

    private TreeNode create(int[] nums, int left, int right) {
        if (left > right)   return null;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = create(nums, left, mid - 1);
        root.right = create(nums, mid + 1, right);
        return root;
    }
}
