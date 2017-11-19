package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P242 {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0;i<s.length();++i) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) +1);
        }
        for (int j=0;j<t.length();++j) {
            char c = t.charAt(j);
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0)
                return false;
        }
        return true;
    }
}
