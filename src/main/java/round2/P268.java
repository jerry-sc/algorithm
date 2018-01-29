package round2;

/**
 * Created on 2018-01-29
 *
 * @author Jerry Shen
 */
public class P268 {

    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i : nums)
            sum += i;
        return (nums.length+1) * nums.length / 2 - sum;
    }
}
