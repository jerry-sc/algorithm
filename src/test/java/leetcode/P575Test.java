package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created on 2017-11-10
 *
 * @author Jerry Shen
 */
public class P575Test {

    private P575 p575 = new P575();

    @Test
    public void test1() {
        int[] nums = {1,1,2,2,3,3};
        Assert.assertEquals(3, p575.distributeCandies(nums));
    }

    @Test
    public void test2() {
        int[] nums = {1,1,2,3};
        Assert.assertEquals(2, p575.distributeCandies(nums));
    }
}