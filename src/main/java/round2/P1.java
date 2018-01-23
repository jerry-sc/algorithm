package round2;


import java.util.HashMap;
import java.util.Map;

public class P1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; ++i) {
            Integer other = null;
            if ((other = map.get(target - nums[i])) != null) {
                return new int[]{other, i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
