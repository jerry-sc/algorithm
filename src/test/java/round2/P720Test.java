package round2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018-02-02
 *
 * @author Jerry Shen
 */
public class P720Test {

    private P720 p720 = new P720();

    @Test
    public void test() {
        String[] words = {"w","wo","wor","worl","world"};
        assertEquals("world", p720.longestWord(words));
    }

    @Test
    public void test1() {
        String[] words = {"ogz","eyj","e","ey","hmn","v","hm","ogznkb","ogzn","hmnm","eyjuo","vuq","ogznk","og","eyjuoi","d"};
        assertEquals("eyj", p720.longestWord(words));
    }

    @Test
    public void test2() {
        String[] words = {"rac","rs","ra","on","r","otif","o","onpdu","rsf","rs","ot","oti","racy","onpd"};
        assertEquals("otif", p720.longestWord(words));
    }


}