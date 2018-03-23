package offer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018-03-23
 *
 * @author Jerry Shen
 */
public class MaxInWindowsTest {

    private MaxInWindows maxInWindows = new MaxInWindows();

    @Test
    public void test() {
        int[] nums = {2,3,4,2,6,2,5,1};
        maxInWindows.maxInWindows(nums, 3);
    }
}