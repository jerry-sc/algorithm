package zuochengyun;

import org.junit.Test;

public class P382_1Test {

    private P382_1 p382_1 = new P382_1();

    @Test
    public void test() {
        int[] arr = {1,2,3,4,5,6,6,7,7,8,8,8,9};
        p382_1.leftUnique(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }



}