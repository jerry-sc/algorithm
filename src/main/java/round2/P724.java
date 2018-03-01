package round2;

public class P724 {

    public int pivotIndex(int[] nums) {
        int sum  = 0;
        int[] tmp = new int[nums.length+1];
        tmp[0] = 0;
        for (int i  = 1;i <= nums.length; ++i) {
            sum+=nums[i-1];
            tmp[i] = sum;
        }
        for (int i = 1; i <= nums.length; ++i) {
            if (tmp[i-1] * 2 == (sum - nums[i])) return i-1;
        }

        return -1;
    }
}
