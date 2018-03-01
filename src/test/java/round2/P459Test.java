package round2;

import org.junit.Test;

import static org.junit.Assert.*;

public class P459Test {

    private P459 p459 = new P459();

    @Test
    public void test1() {
        assertTrue(p459.repeatedSubstringPattern("abab"));
    }

    @Test
    public void test2() {
        assertTrue(p459.repeatedSubstringPattern("abcabcabc"));
    }

    @Test
    public void test3() {
        assertFalse(p459.repeatedSubstringPattern("abac"));
    }
    @Test
    public void test4() {
        assertTrue(p459.repeatedSubstringPattern("abaababaab"));
    }

}