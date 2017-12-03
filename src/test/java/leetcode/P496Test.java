package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class P496Test {

    private P496 p496 = new P496();

    @Test
    public void test1() {
        int[] num1 = {4,1,2};
        int[] num2 = {1,3,4,2};
        int[] res = p496.nextGreaterElement(num1, num2);
        printArr(res);
    }

    private static void printArr(int[] res) {
        for(int i=0;i<res.length;++i)
            System.out.print(res[i] + " ");
    }

}