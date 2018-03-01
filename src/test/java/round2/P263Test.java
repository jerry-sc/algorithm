package round2;

import org.junit.Test;

import static org.junit.Assert.*;

public class P263Test {

    private P263 p263 = new P263();

    @Test
    public void test1() {
        assertEquals(false, p263.isUgly(-2147483648));
    }
}