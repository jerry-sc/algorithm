package round2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018-01-24
 *
 * @author Jerry Shen
 */
public class P169Test {

    private P169 p169 = new P169();

    @Test
    public void test1() {
        int[] nums = {3,4,2,2,4,2};
        assertEquals(2, p169.majorityElement(nums));
    }

}