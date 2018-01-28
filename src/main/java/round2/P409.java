package round2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2018-01-28
 *
 * @author Jerry Shen
 */
public class P409 {

    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>(26);
        for (int i = 0; i < s.length(); ++i) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int res = 0;
        for (int i : map.values()) {
            res += (i / 2 * 2);
        }
        if (res != s.length()) return res + 1;
        return res;
    }
}
