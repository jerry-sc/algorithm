package round2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018-01-29
 *
 * @author Jerry Shen
 */
public class P541Test {

    private P541 p541 = new P541();

    @Test
    public void test1() {
        assertEquals("bacdfeg", p541.reverseStr("abcdefg", 2));
    }

}