package round2;

/**
 * Created on 2018-01-29
 *
 * @author Jerry Shen
 */
public class P70 {

    public int climbStairs(int n) {
        if (n == 1) return 1;
        int a = 1;
        int b = 2;
        for (int i = 3; i <= n; ++i) {
            int tmp = a;
            a = b;
            b = tmp + b;
        }
        return b;
    }
}
