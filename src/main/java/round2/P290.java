package round2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2018-03-03
 *
 * @author Jerry Shen
 */
public class P290 {

    public boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        if (pattern.length() != strings.length) return false;
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> other =  new HashMap<>();
        for (int i = 0; i < pattern.length(); ++i) {
            char ch = pattern.charAt(i);
            if (map.get(ch) == null) {
                if (other.get(strings[i]) != null) return false;
                map.put(ch, strings[i]);
                other.put(strings[i], ch);
            }
            String word = map.get(ch);
            if (!strings[i].equals(word)) {
                return false;
            }
        }
        return true;
    }
}
