package round2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2018-02-02
 *
 * @author Jerry Shen
 */
public class P594 {

    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int max = 0;
        for (int key : map.keySet()) {
            int a = map.get(key);
            int b = map.getOrDefault(key-1, 0);
            int c = map.getOrDefault(key+1, 0);
            if (b != 0 || c!= 0)
                max = Math.max(max, a+Math.max(b, c));
        }
        return max;
    }
}
