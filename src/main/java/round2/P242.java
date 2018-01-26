package round2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2018-01-26
 *
 * @author Jerry Shen
 */
public class P242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())   return false;
        Map<Character, Integer> map = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); ++i) {
            char ch = t.charAt(i);
            if (map.getOrDefault(ch, 0) == 0) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }
}
