package round1;

import org.junit.Test;

import static org.junit.Assert.*;

public class P746Test {

    private P746 p746 = new P746();

    @Test
    public void test1() {
        int[] cost = {10, 15, 20};
        assertEquals(15, p746.minCostClimbingStairs(cost));
    }

    @Test
    public void test2() {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        assertEquals(6, p746.minCostClimbingStairs(cost));
    }

}