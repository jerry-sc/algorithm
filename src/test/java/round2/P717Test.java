package round2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018-01-22
 *
 * @author Jerry Shen
 */
public class P717Test {

    private P717 p717 = new P717();

    @Test
    public void test1() {
        int[] bits = {1,0,0};
        assertTrue(p717.isOneBitCharacter(bits));
    }

    @Test
    public void test2() {
        int[] bits = {1,1,1,0};
        assertFalse(p717.isOneBitCharacter(bits));
    }


}