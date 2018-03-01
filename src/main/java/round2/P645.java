package round2;

public class P645 {

    public int[] findErrorNums(int[] nums) {
        boolean[] have = new boolean[nums.length+1];
        int[] res = new int[2];
        int sum = 0;
        for (int i : nums) {
            sum +=i;
            if (have[i]) {
                res[0] = i;
            } else have[i] = true;
        }
        res[1] = (1 + nums.length) * nums.length / 2 - sum + res[0];
        return res;
    }
}
