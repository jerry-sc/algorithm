package round2;

import java.util.*;

/**
 * Created on 2018-01-24
 *
 * @author Jerry Shen
 */
public class P349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums1) set.add(n);
        Set<Integer> res = new HashSet<>();
        for (int n :nums2) {
            if (set.contains(n))    res.add(n);
        }
        int[] r = new int[res.size()];
        int index = 0;
        for (Integer i : res) {
            r[index++] = i;
        }
        return r;
    }
}
