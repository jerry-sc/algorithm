package round2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018-01-20
 *
 * @author Jerry Shen
 */
public class P696Test {

    private P696 p696 = new P696();

    @Test
    public void test1() {
        assertEquals(6, p696.countBinarySubstrings("000011001111"));
    }

    @Test
    public void test2() {
        assertEquals(6, p696.countBinarySubstrings("00110011"));
    }

    @Test
    public void test3() {
        assertEquals(4, p696.countBinarySubstrings("10101"));
    }

    @Test
    public void test4() {
        assertEquals(6, p696.countBinarySubstrings("000111000"));
    }

}