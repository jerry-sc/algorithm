package round1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2017-11-23
 *
 * @author Jerry Shen
 */
public class P521Test {

    private P521 p521 = new P521();

    @Test
    public void test1() {
        assertEquals(3, p521.findLUSlength("aba","cdc"));
    }

}