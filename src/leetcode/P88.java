package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; j < n; ++i,++j) {
            nums1[i] = nums2[j];
        }

    }
}
