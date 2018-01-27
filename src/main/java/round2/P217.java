package round2;

import java.util.HashSet;
import java.util.Set;

public class P217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int i : nums) {
            if (!set.add(i))    return false;
        }
        return true;
    }
}
