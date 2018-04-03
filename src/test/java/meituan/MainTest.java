package meituan;

import org.junit.Test;

import java.util.Arrays;

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
}