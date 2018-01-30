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
public class P350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>(nums1.length);
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) +1);
        }
        for (int i : nums2) {
            if (map.get(i) != null && map.get(i) > 0) {
                map.put(i, map.get(i) - 1);
                res.add(i);
            }
        }
        int[] result = new int[res.size()];
        int ind = 0;
        while (ind < res.size()) {
            result[ind] = res.get(ind);
            ++ind;
        }
        return result;
    }
}
