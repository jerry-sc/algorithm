package round2;

import java.util.*;

public class P692 {

    public List<String> topKFrequent(String[] words, int k) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> queue = new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue().equals(o2.getValue())) {
                    return o1.getKey().compareTo(o2.getKey());
                } else {
                    return o2.getValue() - o1.getValue();
                }
            }
        });
        queue.addAll(map.entrySet());
        int count = 0;
        while (count < k) {
            Map.Entry<String, Integer> entry = queue.poll();
            res.add(entry.getKey());
            ++count;
        }
        return res;
    }
}
