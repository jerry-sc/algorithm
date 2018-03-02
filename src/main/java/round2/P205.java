package round2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created on 2018-03-02
 *
 * @author Jerry Shen
 */
public class P205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>(); // map to other
        Set<Character> set = new HashSet<>();    // map to itself
        for (int i = 0; i < s.length(); ++i) {
            char first = map.get(s.charAt(i)) == null ? s.charAt(i) : map.get(s.charAt(i));
            char last = t.charAt(i);
            if (first != last) {
                if (map.get(first) != null) {
                    return false;
                }
                if (set.contains(last) || set.contains(first)) return false;
                map.put(first, last);
            } else {
                set.add(first);
            }
        }
        return true;
    }
}
