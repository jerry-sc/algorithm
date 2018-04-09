package offer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018-04-04
 *
 * @author Jerry Shen
 */
public class FindIndexEqualValTest {

    private FindIndexEqualVal findIndexEqualVal = new FindIndexEqualVal();

    @Test
    public void test() {
        int[] arr = {-3,-1,1,4,5};
        System.out.println(findIndexEqualVal.findIndexEqualVal(arr));
    }
}