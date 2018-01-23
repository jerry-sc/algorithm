package round2;

import org.junit.Test;

import static org.junit.Assert.*;

public class P492Test {

    private P492 p492 = new P492();

    @Test
    public void test1() {
        int[] res = {2,2};
        assertArrayEquals(res, p492.constructRectangle(4));
    }

    @Test
    public void test2() {
        int[] res = {3,2};
        assertArrayEquals(res, p492.constructRectangle(6));
    }

}