package round1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int i=0;i<nums1.length;++i) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i=0;i<nums2.length;++i) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                res.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        int[] arr = new int[res.size()];
        int len = 0;
        for (Integer i: res) {
            arr[len++] = i;
        }
        return arr;
    }
}
