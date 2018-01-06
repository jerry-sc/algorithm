package round1;

import java.util.HashSet;
import java.util.Set;

public class P349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<nums1.length;++i) {
            set.add(nums1[i]);
        }
        Set<Integer> result = new HashSet<>();
        for (int i=0;i<nums2.length;++i) {
            if (set.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }
        int[] a = new int[result.size()];
        int j = 0;
        for (Integer i : result) {
            a[j++] = i;
        }
        return a;
    }
}
