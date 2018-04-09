package offer;

import org.junit.Test;

/**
 * Created on 2018-04-01
 *
 * @author Jerry Shen
 */
public class FindDuplicationTest {

    private FindDuplication findDuplication = new FindDuplication();

    @Test
    public void test() {
        int[] array = {2,3,5,4,3,2,6,7};
        int a = findDuplication.getDuplication(array);
        System.out.println(a);
    }
}