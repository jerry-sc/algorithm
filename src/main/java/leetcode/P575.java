package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created on 2017-11-10
 *
 * @author Jerry Shen
 */
public class P575 {

    public int distributeCandies(int[] candies) {
        Set<Integer> sets = new HashSet<>();
        for (int i : candies) {
            sets.add(i);
        }
        return sets.size() > candies.length / 2 ? candies.length / 2 : sets.size();
    }
}
