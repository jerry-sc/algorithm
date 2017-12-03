package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class P682Test {

    private P682 p682 = new P682();

    @Test
    public void test1() {
        String[] ops = {"5","2","C","D","+"};
        assertEquals(30, p682.calPoints(ops));
    }

    @Test
    public void test2() {
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        assertEquals(27, p682.calPoints(ops));
    }
}