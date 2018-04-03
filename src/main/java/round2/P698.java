package round2;

/**
 * Created on 2018-03-31
 *
 * @author Jerry Shen
 */
public class P698 {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int i : nums) sum += i;
        if (sum % k != 0) return false;
        boolean[] visited = new boolean[nums.length];
        return canPartition(nums, visited, k, 0, 0, sum / k);
    }

    private boolean canPartition(int[] nums, boolean[] visited, int k, int start, int curSum, int target) {
        if (k == 1) return true;
        if (curSum == target) return canPartition(nums, visited, k - 1, 0, 0, target);
        for (int i = start; i < nums.length; ++i) {
            if (!visited[i] && curSum + nums[i] <= target) {
                visited[i] = true;
                if (canPartition(nums, visited, k, start + 1, curSum + nums[i], target)) {
                    return true;
                }
                visited[i] = false;
            }
        }
        return false;
    }
}
