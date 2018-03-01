package round2;

import java.util.HashMap;
import java.util.Map;

public class P788 {

    public int rotatedDigits(int N) {
        Map<Integer, Boolean> map = new HashMap<>();
        map.put(2, true);
        map.put(5, true);
        map.put(9, true);
        map.put(6, true);
        Map<Integer, Boolean> valid = new HashMap<>();
        valid.putAll(map);
        valid.put(0, true);
        valid.put(1, true);
        valid.put(8, true);
        int count = 0;
        for (int i = 1; i <= N; ++i) {
            int tmp = i;
            boolean flag = true;
            boolean tag = false;
            while (tmp != 0) {
                int a = tmp % 10;
                if (valid.get(a) == null) {
                    flag = false;
                    break;
                }
                if (map.get(a) != null) tag = true;
                tmp /= 10;
            }
            if (flag && tag) ++count;
        }
        return count;
    }
}
