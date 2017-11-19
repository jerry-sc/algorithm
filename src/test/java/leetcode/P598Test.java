package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class P598Test {

    private P598 p598 = new P598();

    @Test
    public void test1() {
        int[][] op = {{2,2},{3,3}};
        assertEquals(4, p598.maxCount(3,3,op));
    }

}