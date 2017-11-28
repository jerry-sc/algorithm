package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2017-11-28
 *
 * @author Jerry Shen
 */
public class P383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0;i<magazine.length();++i) {
            Character ch = magazine.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for (int i=0;i<ransomNote.length();++i) {
            Character ch = ransomNote.charAt(i);
            int left = map.getOrDefault(ch, 0);
            if (left <= 0)
                return false;
            else
                map.put(ch, --left);
        }
        return true;
    }
}
