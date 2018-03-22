package offer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018-03-20
 *
 * @author Jerry Shen
 */
public class P29Test {

    private P29 p29 = new P29();

    @Test
    public void test1() {
        int[][] matrix = {{1},{2},{3},{4},{5}};
        p29.printMatrix(matrix);
    }
}