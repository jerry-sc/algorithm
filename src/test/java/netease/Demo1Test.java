package netease;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018-03-21
 *
 * @author Jerry Shen
 */
public class Demo1Test {

    private Demo1 demo1 = new Demo1();

    @Test
    public void test1() {
        System.out.println(demo1.minCount(3,100,1,2,6));
    }

    @Test
    public void test2() {
        System.out.println(demo1.minCount(1,1,1,5,6));
    }
}