package round1;

import java.util.HashMap;
import java.util.Map;

public class P496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums2.length;++i) {
            boolean flag = false;
            for (int j = i+1;j<nums2.length;++j) {
                if (nums2[j] > nums2[i]) {
                    flag = true;
                    map.put(nums2[i], nums2[j]);
                    break;
                }
            }
            if (!flag)
                map.put(nums2[i], -1);
        }
        int[] res = new int[nums1.length];
        for (int i=0;i<nums1.length;++i) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
