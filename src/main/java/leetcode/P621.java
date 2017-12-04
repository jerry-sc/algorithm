package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 有错误，下次再做
 */
public class P621 {

    public int leastInterval(char[] tasks, int n) {
        Queue<Character> queue = new LinkedList<>();
        Map<Character,Integer> map = new HashMap<>();
        for (char ch : tasks) {
            queue.add(ch);
            map.put(ch, -1);
        }
        int count = 0;
        int size = 0;
        int len = queue.size();
        while (queue.size() != 0) {
            char ch = queue.poll();
            if (map.get(ch) == -1 || (count - map.get(ch) > n)) {
                map.put(ch, count);
                ++count;
            } else {

                queue.add(ch);
            }
            if (size == len) {
                size = 0;
                ++count;
            }
            ++size;
        }
        return count;
    }
}