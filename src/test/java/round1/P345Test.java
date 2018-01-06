package round1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2017-11-28
 *
 * @author Jerry Shen
 */
public class P345Test {

    private P345 p345 = new P345();

    @Test
    public void test1() {
        assertEquals("holle", p345.reverseVowels("hello"));
    }

    @Test
    public void test2() {
        assertEquals("leotcede", p345.reverseVowels("leetcode"));
    }

    @Test
    public void test3() {
        assertEquals(".,", p345.reverseVowels(".,"));
    }
}