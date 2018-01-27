package round2;


import java.util.*;

/**
 * Created on 2018-01-27
 *
 * @author Jerry Shen
 */
public class P506 {

    public String[] findRelativeRanks(int[] nums) {
        String[] res = new String[nums.length];
        List<Integer> list = new ArrayList<>(nums.length);
        for (int i : nums)  list.add(i);
        list.sort(Collections.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < list.size(); ++i) {
            map.put(list.get(i), i);
        }
        int ind = 0;
        for (int i : nums) {
            switch (map.get(i)) {
                case 0:
                    res[ind++] = "Gold Medal";
                    break;
                case 1:
                    res[ind++] = "Silver Medal";
                    break;
                case 2:
                    res[ind++] = "Bronze Medal";
                    break;
                default:
                    res[ind++] = map.get(i) + 1 + "";
            }
        }
        return res;
    }
}
