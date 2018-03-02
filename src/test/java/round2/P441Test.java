package round2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018-03-02
 *
 * @author Jerry Shen
 */
public class P441Test {

    private P441 p441 = new P441();

    @Test
    public void test1(){
        System.out.println(p441.arrangeCoins(2147483647));
    }
}