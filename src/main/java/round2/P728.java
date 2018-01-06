package round2;

import java.util.ArrayList;
import java.util.List;

public class P728 {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; ++i) {
            int tmp = i;
            boolean flag = true;
            while (tmp != 0) {
                int digit = tmp % 10;
                tmp /= 10;
                if (digit == 0 || i % digit != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                res.add(i);
        }
        return res;
    }
}
