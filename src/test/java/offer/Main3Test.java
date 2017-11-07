package offer;


import org.junit.Assert;
import org.junit.Test;

public class Main3Test {

    private int[][] array = {
            {1,2,8,9},
            {2,4,9,12},
            {4,7,10,13},
            {6,8,11,15}
    };

    private Main3 main3 = new Main3();

    @Test
    public void test1() {
        Assert.assertTrue(main3.find(array, 7));
        Assert.assertFalse(main3.find(array, 5 ));
    }

}