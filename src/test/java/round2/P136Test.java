package round2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018-01-18
 *
 * @author Jerry Shen
 */
public class P136Test {

    private P136 p136 = new P136();

    @Test
    public void test1() {
        int[] nums = {4,2,3,3,2};
        assertEquals(4, p136.singleNumber(nums));
    }
}