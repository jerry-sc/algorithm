package offer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018-04-01
 *
 * @author Jerry Shen
 */
public class FindMinTest {

    public FindMin findMin = new FindMin();

    @Test
    public void test() {
        int[] array = {1,0,1,1,1};
        System.out.println(findMin.minNumberInRotateArray(array));
    }
}