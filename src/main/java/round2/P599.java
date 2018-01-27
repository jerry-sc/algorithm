package round2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P599 {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>(list1.length);
        for (int i = 0; i < list1.length; ++i)  map.put(list1[i], i);
        List<String> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<list2.length;++i) {
            if (map.get(list2[i]) != null) {
                int tmp = i + map.get(list2[i]);
                if (tmp < min) {
                    res.clear();
                    res.add(list2[i]);
                    min = tmp;
                } else if (tmp == min) {
                    res.add(list2[i]);
                }
            }
        }
        return res.toArray(new String[1]);
    }
}
