package offer;

import org.junit.Test;

/**
 * Created on 2018-04-04
 *
 * @author Jerry Shen
 */
public class FindMissNumberTest {

    private FindMissNumber findMissNumber = new FindMissNumber();

    @Test
    public void test() {
        int[] arr = {1,2,3,4,5};
        System.out.println(findMissNumber.findMissNumber(arr));
    }
}