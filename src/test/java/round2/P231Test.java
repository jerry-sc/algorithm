package round2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018-02-03
 *
 * @author Jerry Shen
 */
public class P231Test {

    private P231 p231 = new P231();

    @Test
    public void test1() {
        assertFalse(p231.isPowerOfTwo(1073741825));
    }

}