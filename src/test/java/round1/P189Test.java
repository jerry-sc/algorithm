package round1;

import org.junit.Test;

public class P189Test {

    private P189 p189 = new P189();

    @Test
    public void test1() {
        int[] nums = {1,2,3,4,5,6,7};
        p189.rotate(nums, 3);
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}