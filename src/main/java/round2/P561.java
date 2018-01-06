package round2;

import java.util.Arrays;

public class P561 {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0, i = 0;
        while (i < nums.length) {
            sum += nums[i];
            i += 2;
        }
        return sum;
    }
}
