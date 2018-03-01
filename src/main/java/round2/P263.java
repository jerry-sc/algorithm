package round2;

import java.util.HashSet;
import java.util.Set;

public class P263 {
    public boolean isUgly(int num) {
        if (num <= 0) return false;
        Set<Integer> set = new HashSet<>();
        int n = num;
        for (int i = 2; i <= num && i <= n;) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
            ++i;
            if (i > 5)  return false;
        }
        for (Integer i : set) {
            if (i != 2 && i != 3 && i != 5)
                return false;
        }
        return true;
    }
}
