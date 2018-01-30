package round2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on 2018-01-29
 *
 * @author Jerry Shen
 */
public class P401 {

    private Map<Integer, List<String>> hMap = new HashMap<>();
    private Map<Integer, List<String>> mMap = new HashMap<>();

    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i <= 11; ++i) {
            int bits = countOne(i);
            List<String> tmp;
            if ((tmp = hMap.get(bits)) == null) {
                tmp = new ArrayList<>();
                hMap.put(bits, tmp);
            }
            tmp.add(i + "");
        }
        for (int i = 0; i <= 59; ++i) {
            int bits = countOne(i);
            List<String> tmp;
            if ((tmp = mMap.get(bits)) == null) {
                tmp = new ArrayList<>();
                mMap.put(bits, tmp);
            }
            if (i < 10) tmp.add(":0" + i);
            else tmp.add(":" + i);
        }
        for (int i = 0; i <= 3 && i <= num; ++i) {
            List<String> hList = hMap.get(i);
            if (num - i > 5) continue;
            List<String> mList = mMap.get(num - i);
            for (String hour : hList) {
                for (String min : mList) {
                    res.add(hour + min);
                }
            }
        }
        return res;
    }

    private int countOne(int n) {
        return Integer.bitCount(n);
    }
}
