package round1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class P665Test {

    private P665 p665 = new P665();

    @Test
    public void test1() {
        int[] nums = {3,4,2,3};
        Assert.assertFalse(p665.checkPossibility(nums));
    }

    @Test
    public void test2() {
        int[] nums = {1,4,2,3};
        Assert.assertTrue(p665.checkPossibility(nums));
    }

    @Test
    public void test3() {
        int[] nums = {2,3,3,2,4};
        assertTrue(p665.checkPossibility(nums));
    }
}