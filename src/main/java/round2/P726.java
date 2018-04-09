package round2;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created on 2018-04-04
 *
 * @author Jerry Shen
 */
public class P726 {

    private int index;

    public String countOfAtoms(String formula) {
        index = 0;
        Map<String, Integer> map = count(formula.toCharArray());
        StringBuilder sb = new StringBuilder();
        for (String name : map.keySet()) {
            sb.append(name);
            int multi = map.get(name);
            if (multi > 1) sb.append(multi);
        }
        return sb.toString();
    }

    private Map<String, Integer> count(char[] arr) {
        Map<String, Integer> map = new TreeMap<>();
        while (index < arr.length && arr[index] != ')') {
            if (arr[index] == '(') {
                ++index;
                Map<String, Integer> tmp = count(arr);
                for (Map.Entry<String, Integer> entry : tmp.entrySet()) {
                    map.put(entry.getKey(), map.getOrDefault(entry.getKey(), 0) + entry.getValue());
                }
            } else {
                int i = index++;
                while (index < arr.length && Character.isLowerCase(arr[index])) ++index;
                String name = new String(arr, i, index - i);
                i = index;
                while (index < arr.length && Character.isDigit(arr[index])) ++index;
                int multi = i < index ? Integer.parseInt(new String(arr, i, index - i)) : 1;
                map.put(name, map.getOrDefault(name, 0) + multi);
            }
        }
        int i = ++index;
        while (index < arr.length && Character.isDigit(arr[index])) ++index;
        if (i < index) {
            int multi = Integer.parseInt(new String(arr, i, index - i));
            for (String key : map.keySet()) {
                map.put(key, map.get(key) * multi);
            }
        }
        return map;
    }

}
