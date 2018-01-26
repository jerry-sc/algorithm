package round2;

import java.util.*;

/**
 * Created on 2018-01-26
 *
 * @author Jerry Shen
 */
public class P697 {

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0 ) + 1);
        }
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                list.clear();
                list.add(entry.getKey());
            } else if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i : list) {
            int m = 0,n = nums.length - 1;
            while (nums[m] != i) ++m;
            while (nums[n] != i) --n;
            min = Math.min(min, n - m + 1);
        }
        return min;
    }
}
