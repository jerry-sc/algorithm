package round2;

import java.util.ArrayList;
import java.util.List;

public class P7 {

    public int reverse(int x) {
        int flag = x < 0 ? -1 : 1;
        x *= flag;
        List<Integer> list = new ArrayList<>();
        while (x != 0) {
            list.add(x % 10);
            x /= 10;
        }
        long res = 0;
        int i = 0;
        while (i < list.size()) {
            res = res * 10 + list.get(i++);
        }
        res *= flag;
        if (res < 0) {
            if (res < Integer.MIN_VALUE) return 0;
        } else {
            if (res > Integer.MAX_VALUE) return 0;
        }
        return (int) res;
    }
}
