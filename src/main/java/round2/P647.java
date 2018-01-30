package round2;

/**
 * Created on 2018-01-29
 *
 * @author Jerry Shen
 */
public class P647 {

    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;
        int len = 1;
        int max = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > nums[i-1]) {
                ++len;
            } else {
                max = Math.max(max, len);
                len = 1;
            }
        }
        max = Math.max(max, len);
        return max;
    }
}
