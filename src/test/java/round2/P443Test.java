package round2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018-03-02
 *
 * @author Jerry Shen
 */
public class P443Test {

    private P443 p443 = new P443();

    @Test
    public void test1() {
        char[] chars = {'a','a','b','b','c','c','c'};
        assertEquals(6, p443.compress(chars));
    }

}