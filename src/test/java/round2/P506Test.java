package round2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018-01-27
 *
 * @author Jerry Shen
 */
public class P506Test {

    private P506 p506 = new P506();

    @Test
    public void test() {
        int[] nums = {5,4,3,2,1};
        p506.findRelativeRanks(nums);
    }

}