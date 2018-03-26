package meituan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Map<Integer, Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();
        for (char c : ch) {
            map.put(c - '0', map.getOrDefault(c - '0', 0) + 1);
        }
        int x = 1;
        Map<Integer, Integer> tmp = new HashMap<>();
        while (true) {
            map.clear();
            int y = x;
            while (y != 0) {
                int c = y % 10;
                tmp.put(c, tmp.getOrDefault(c , 0) + 1);
                y /= 10;
            }
            boolean flag = true;
            for (Map.Entry<Integer, Integer> entry : tmp.entrySet()) {
                if (map.get(entry.getKey()) == null || map.get(entry.getKey()) < entry.getValue()) {
                    flag = false;
                    break;
                }
            }
            if (!flag)
                break;
            else
                ++x;
        }
        System.out.println(x);
    }
}
