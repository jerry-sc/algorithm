package leetcode;


import java.util.HashSet;
import java.util.Set;

public class P532 {

    public int findPairs(int[] nums, int k) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;++i) {
            for (int j=i;j<nums.length;++j) {
                int diff = nums[j] - nums[i];
                int flag = diff > 0 ? 1 : -1;
                int value = Math.max(nums[i], nums[j]) * flag;
                if (diff * flag == k && !set.contains(value)) {
                    ++count;
                    set.add(value);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,2};
        P532 p532 = new P532();
        System.out.println(p532.findPairs(a, 1));
    }
}
