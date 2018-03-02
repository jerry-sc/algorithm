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
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> other = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char first = map.get(s.charAt(i)) == null ? s.charAt(i) : map.get(s.charAt(i));
            char last = t.charAt(i);
            if (first != last) {
                if (map.get(s.charAt(i)) != null || other.get(last) != null) return false;
                map.put(first, last);
                other.put(last, first);
            } else {
                if (map.get(s.charAt(i)) == null) {
                    map.put(first, first);
                    other.put(first, first);
                }
            }
        }
        return true;
    }
}
