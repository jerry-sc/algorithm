package round2;

import java.util.HashMap;
import java.util.Map;

public class P389 {

    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            Integer count = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i), count+1);
        }
        for (int i = 0; i < t.length(); ++i) {
            if (map.getOrDefault(t.charAt(i), 0) == 0){
                return t.charAt(i);
            } else {
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            }
        }
        return ' ';
    }
}
