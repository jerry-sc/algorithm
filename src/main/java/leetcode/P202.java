package leetcode;

import java.util.HashSet;
import java.util.Set;

public class P202 {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int x = n;
        while (true) {
            x = cal(x);
            if (x == 1)
                return true;
            if (!set.add(x)) {
                return false;
            }
        }
    }

    private int cal(int n) {
        int sum = 0;
        while (n > 0) {
            int a = n %10;
            sum += a*a;
            n /= 10;
        }
        return sum;
    }
}
