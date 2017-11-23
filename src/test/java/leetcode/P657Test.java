package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2017-11-23
 *
 * @author Jerry Shen
 */
public class P657Test {

    private P657 p657 = new P657();

    @Test
    public void test1() {
        assertTrue(p657.judgeCircle("UD"));
    }

    @Test
    public void test2() {
        assertFalse(p657.judgeCircle("LL"));
    }

}