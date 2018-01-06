package round1;

import org.junit.Test;

import static org.junit.Assert.*;

public class P389Test {

    private P389 p389 = new P389();

    @Test
    public void test1() {
        String s = "abcd";
        String t = "abcde";
        assertEquals('e',p389.findTheDifference(s, t));
    }

    @Test
    public void test2() {
        String s = "a";
        String t = "aa";
        assertEquals('a', p389.findTheDifference(s,t));
    }
}