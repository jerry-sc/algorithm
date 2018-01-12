package round2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P500 {

    private Map<Character, Integer> line1 = transfer("QWERTYUIOP", 1);
    private Map<Character, Integer> line2 = transfer("ASDFGHJKL", 2);
    private Map<Character, Integer> line3 = transfer("ZXCVBNM", 3);

    private Map<Character, Integer> transfer(String string, int value) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); ++i) {
            map.put(string.charAt(i), value);
        }
        return map;
    }

    private int search(char first) {
        return line1.get(first) != null ? 1 : line2.get(first) != null ? 2 : 3;
    }

    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (word.length() == 1) {
                list.add(word);
                continue;
            }
            String temp = word.toUpperCase();
            int line = search(temp.charAt(0));
            boolean flag = true;
            for (int i = 1; i < temp.length(); ++i) {
                if (line != search(temp.charAt(i))) {
                    flag = false;
                    break;
                }
            }
            if (flag) list.add(word);
        }
        return list.toArray(new String[0]);
    }
}
