package leetcode;

/**
 * 此方案会超时，具体方案查看leetcode
 */
public class P219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; ++i) {
            int j = i+1;
            while (j < nums.length) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
                if (Math.abs(i - j) > k)
                    break;;

                ++j;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        P219 p219 = new P219();
        int[] nums = {1,0,1,1};
        System.out.println(p219.containsNearbyDuplicate(nums, 1));
    }
}
