package round2;

/**
 * Created on 2018-01-18
 *
 * @author Jerry Shen
 */
public class P485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0) {
                max = Math.max(max, count);
                count = 0;
            } else {
                ++count;
            }
        }
        return Math.max(max, count);
    }
}
