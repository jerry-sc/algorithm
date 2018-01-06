package round1;

import org.junit.Test;

import static org.junit.Assert.*;

public class P168Test {

    private P168 p168 = new P168();

    @Test
    public void test1() {
        assertEquals("AA", p168.convertToTitle(27));
    }

    @Test
    public void test2() {
        assertEquals("C", p168.convertToTitle(3));
    }

}