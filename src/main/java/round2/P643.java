package round2;

public class P643 {

    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j = k-1;
        double sum = 0;
        for (int m = 0; m < k; ++m) sum+=nums[m];
        double max = sum;
        while (j < nums.length-1) {
            sum -= nums[i++];
            sum += nums[++j];
            if (sum > max) max = sum;
        }
        return max / k;
    }
}
