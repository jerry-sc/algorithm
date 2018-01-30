package round2;

/**
 * Created on 2018-01-29
 *
 * @author Jerry Shen
 */
public class P746 {

    public int minCostClimbingStairs(int[] cost) {
        int a = cost[0];
        int b = cost[1];
        for (int i = 2; i < cost.length; ++i) {
            int tmp = a;
            a = b;
            b = Math.min(tmp, b) + cost[i];
        }
        return Math.min(a, b);
    }
}
