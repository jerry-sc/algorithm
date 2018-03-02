package round2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P438 {

    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) return new ArrayList<>(0);
        Map<Character, Integer> map = new HashMap<>(26);
        for (int i = 0; i < p.length(); ++i) {
            char ch = p.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        Map<Character, Integer> tmp = new HashMap<>(26);
        for (int i = 0; i < p.length(); ++i) {
            char ch = p.charAt(i);
            tmp.put(ch, tmp.getOrDefault(ch, 0) + 1);
        }
        int i=0, j = p.length()-1;
        List<Integer> res = new ArrayList<>();
        while (j < s.length()) {
            if (isSame(map, tmp))   res.add(i);
            char one = s.charAt(i);
            tmp.put(one, tmp.get(one) - 1);
            if (tmp.get(one) == 0) tmp.remove(one);
            ++i;++j;
            char two = p.charAt(j);
            tmp.put(two, tmp.getOrDefault(two, 0) + 1);
        }
        return res;
    }

    private boolean isSame(Map<Character, Integer> map, Map<Character, Integer> tmp) {
        if (map.size() != tmp.size()) return false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (!entry.getValue().equals(tmp.get(entry.getKey()))) return false;
        }
        return true;
    }
}
