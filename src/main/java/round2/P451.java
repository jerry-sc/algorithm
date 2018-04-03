package round2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P451 {

    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        List<Character>[] buckets = new List[s.length() + 1];
        for (Character key : map.keySet()) {
            int count = map.get(key);
            if (buckets[count] == null) {
                buckets[count] = new ArrayList<>();
            }
            buckets[count].add(key);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = buckets.length - 1; i >= 0; --i) {
            if (buckets[i] != null) {
                for (char ch : buckets[i]) {
                    int k = 0;
                    while (k < map.get(ch)) {
                        k++;
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }
}
