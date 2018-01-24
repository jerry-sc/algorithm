package round2;

/**
 * Created on 2018-01-24
 *
 * @author Jerry Shen
 */
public class P169 {

    public int majorityElement(int[] nums) {
        int p = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == p) {
                ++count;
            } else {
                --count;
                if (count == 0) {
                    p = nums[i];
                    count = 1;
                }
            }
        }
        return p;
    }
}
