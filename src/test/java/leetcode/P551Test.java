package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2017-11-28
 *
 * @author Jerry Shen
 */
public class P551Test {

    private P551 p551 =  new P551();

    @Test
    public void test1() {
        assertTrue(p551.checkRecord("PPALLP"));
    }

    @Test
    public void test2() {
        assertFalse(p551.checkRecord("PPALLL"));
    }

}