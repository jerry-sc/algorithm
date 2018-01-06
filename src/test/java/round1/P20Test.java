package round1;

import org.junit.Test;

import static org.junit.Assert.*;

public class P20Test {

    private P20 p20 = new P20();

    @Test
    public void test1() {
        assertTrue(p20.isValid("()[]{}"));
    }

    @Test
    public void test2() {
        assertFalse(p20.isValid("([)]"));
    }

    @Test
    public void test3() {
        assertFalse(p20.isValid("]"));
    }

}