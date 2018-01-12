package round2;

import java.util.HashSet;
import java.util.Set;

public class P575 {

    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>(candies.length);
        for (int i : candies) {
            set.add(i);
        }
        return Math.min(set.size(), candies.length / 2);
    }
}
