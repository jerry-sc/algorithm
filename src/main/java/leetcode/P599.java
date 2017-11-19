package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P599 {

    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> map1 = new HashMap<>();
        for (int i=0;i<list1.length;++i) {
            map1.put(list1[i], i);
        }
        int min = Integer.MAX_VALUE;
        for (int i=0;i<list2.length;++i) {
            if (map1.containsKey(list2[i])) {
                if (map1.get(list2[i]) + i < min) {
                    res.clear();
                    res.add(list2[i]);
                    min = map1.get(list2[i]) + i;
                } else if (map1.get(list2[i]) + i == min)
                    res.add(list2[i]);
            }
        }
        return res.toArray(new String[]{});
    }

}
