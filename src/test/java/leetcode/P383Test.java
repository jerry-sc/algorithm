package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2017-11-28
 *
 * @author Jerry Shen
 */
public class P383Test {

    private P383 p383 = new P383();

    @Test
    public void test1() {
        assertFalse(p383.canConstruct("a", "b"));
    }

    @Test
    public void test2() {
        assertTrue(p383.canConstruct("aa", "aab"));
    }
}