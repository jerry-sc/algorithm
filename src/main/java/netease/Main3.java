package netease;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; ++i) {
            v[i] = scanner.nextInt();
        }
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        System.out.println(put(v, 0, k, map));
    }

    private static int put(int[] v, int index, int left, Map<Integer, Map<Integer, Integer>> map) {
        int count = 0;
        if (index == v.length) {
            count = left >= 0 ? 1 : 0;
        } else {
            for (int i = 0; i < 2 && left - v[index] * i >= 0; ++i) {
                if (map.get(index+1) != null && map.get(index+1).get(left - v[index] * i) != null) {
                    int val = map.get(index+1).get(left - v[index] * i);
                    count += val == -1 ? 0 : val;
                } else {
                    count += put(v, index + 1, left - v[index] * i, map);
                }
            }
        }
        Map<Integer, Integer> tmp;
        if ((tmp = map.get(index)) == null) {
             tmp = new HashMap<>();
             map.put(index, tmp);
        }
        tmp.put(left, count == 0 ? -1 : count);
        return count;
    }
}
