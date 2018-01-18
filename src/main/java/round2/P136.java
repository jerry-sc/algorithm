package round2;

/**
 * Created on 2018-01-18
 *
 * @author Jerry Shen
 */
public class P136 {

    public int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            res ^= nums[i];
        }
        return res;
    }
}
