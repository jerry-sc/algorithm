package offer;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created on 2018-04-01
 *
 * @author Jerry Shen
 */
public class MinKTest {

    private MinK minK = new MinK();

    @Test
    public void test() {
        int[] input = {4,5,1};
        ArrayList<Integer> list = minK.GetLeastNumbers_Solution(input, -1);
        for (int i : list)
            System.out.println(i);
    }
}