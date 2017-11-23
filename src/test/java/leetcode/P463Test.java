package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2017-11-10
 *
 * @author Jerry Shen
 */
public class P463Test {

    private P463 p463 = new P463();

    @Test
    public void test1() {
        int[][] grid = {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        };
        assertEquals(16, p463.islandPerimeter(grid));
    }
}