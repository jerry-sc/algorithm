package round2;

public class P283 {

    public void moveZeroes(int[] nums) {
        for (int i = nums.length - 1; i >= 0; --i) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; ++j) {
                    if (nums[j] == 0)   break;
                    else {
                        nums[j-1] = nums[j];
                        nums[j] = 0;
                    }
                }
            }
        }
    }
}
