package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P581 {

    public int findUnsortedSubarray(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
        Collections.sort(list);
        int i = 0, j = nums.length-1;
        while (i < nums.length && list.get(i) == nums[i]) {
            ++i;
        }
        while (j >= 0 && list.get(j) == nums[j]) {
            --j;
        }
        return Math.max(0, j - i +1);
    }

    public static void main(String[] args) {
        P581 p581 = new P581();
        int[] a = {1,2,3,4};
        System.out.println(p581.findUnsortedSubarray(a));
    }

}
