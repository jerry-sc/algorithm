package round2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018-01-29
 *
 * @author Jerry Shen
 */
public class P401Test {

    private P401 p401 = new P401();

    @Test
    public void test1() {
        for (String string : p401.readBinaryWatch(6)) {
            System.out.println(string);
        }
    }
}