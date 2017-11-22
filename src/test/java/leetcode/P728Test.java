package leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class P728Test {

    private P728 p728 = new P728();

    @Test
    public void test1() {
        List<Integer> list = p728.selfDividingNumbers(1,22);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}