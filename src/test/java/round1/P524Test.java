package round1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class P524Test {

    private P524 p524 = new P524();

    @Test
    public void test1() {
        List<String> list = new ArrayList<>();
        list.add("ale");
        list.add("apple");
        list.add("monkey");
        list.add("plea");
        assertEquals("apple", p524.findLongestWord("abpcplea", list));
    }

    @Test
    public void test2() {
        List<String> list =new ArrayList<>();
        list.add("ba");
        list.add("ab");
        assertEquals("ab", p524.findLongestWord("bab", list));
    }
}