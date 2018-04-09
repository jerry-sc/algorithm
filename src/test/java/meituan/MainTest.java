package meituan;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainTest {

    private Main1 main;

    @Test
    public void test() {
        int n = 4;
        char[] number = new char[n];
        helper(number, n, 0);
    }

    private void helper(char[] number, int n, int index) {
        if (index == n) {
            System.out.println(new String(number));
            return;
        }
        for (int i = 0; i < 10; ++i) {
            number[index] = (char) (i + '0');
            helper(number, n, index+1);
        }
    }

    @Test
    public void test1() {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("11", 1);
        map.put("22", 2);
        map.put("11", 3);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }
}