package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class P415Test {

    private P415 p415 = new P415();

    @Test
    public void test() {
        String num1 = "123";
        String num2 = "2323";
        assertEquals("2446", p415.addStrings(num1, num2));
    }

    @Test
    public void test2() {
        String num1 = "1";
        String num2 = "9";
        assertEquals("10", p415.addStrings(num1, num2));
    }

    @Test
    public void test3() {
        String num1 = "408";
        String num2 = "5";
        assertEquals("413", p415.addStrings(num1, num2));
    }

}