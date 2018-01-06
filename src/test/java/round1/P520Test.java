package round1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2017-11-23
 *
 * @author Jerry Shen
 */
public class P520Test {

    private P520 p520 = new P520();

    @Test
    public void test1() {
        assertTrue(p520.detectCapitalUse("USA"));
    }

    @Test
    public void test2() {
        assertFalse(p520.detectCapitalUse("FlaG"));
    }
}