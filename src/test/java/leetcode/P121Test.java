package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class P121Test {

    private P121 p121 = new P121();

    @Test
    public void test1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, p121.maxProfit(prices));
    }

}