package round1;

import org.junit.Test;

import static org.junit.Assert.*;

public class P28Test {

    private P28 p28 = new P28();

    @Test
    public void test1() {
        assertEquals(2, p28.strStr("hello", "ll"));
    }

    @Test
    public void test2() {
        assertEquals(-1, p28.strStr("aaaaaa", "bba"));
    }

    @Test
    public void test3() {
        assertEquals(4, p28.strStr("mississippi", "issip"));
    }
}