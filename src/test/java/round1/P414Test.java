package round1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P414Test {

    private P414 p414;

    @Before
    public void setUp() throws Exception {
        p414 = new P414();
    }

    @Test
    public void test1() {
        int[] nums = {3,2,1};
        Assert.assertEquals(1, p414.thirdMax(nums));
    }

    @Test
    public void test2() {
        int[] nums = {1,2};
        Assert.assertEquals(2, p414.thirdMax(nums));
    }

    @Test
    public void test3() {
        int[] nums = {2,2,3,1};
        Assert.assertEquals(1, p414.thirdMax(nums));
    }

}