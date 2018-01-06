package round1;

import org.junit.Test;

import static org.junit.Assert.*;

public class P202Test {

    private P202 p202 = new P202();

    @Test
    public void test1() {
        assertTrue(p202.isHappy(7));
    }

}