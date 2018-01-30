package round2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018-01-28
 *
 * @author Jerry Shen
 */
public class P661Test {

    private P661 p661 = new P661();

    @Test
    public void test() {
        int[][] M = {{1,1,1},{1,0,1},{1,1,1}};
        p661.imageSmoother(M);
    }

}