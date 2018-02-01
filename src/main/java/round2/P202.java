package round2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created on 2018-02-01
 *
 * @author Jerry Shen
 */
public class P202 {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        n = cal(n);
        while (set.add(n)) {
            n = cal(n);
            if (n == 1) return true;
        }
        return false;
    }

    private int cal(int n) {
        int sum = 0;
        while (n != 0) {
            int a = n % 10;
            sum += a * a;
            n /= 10;
        }
        return sum;
    }
}
