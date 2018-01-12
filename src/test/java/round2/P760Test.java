package round2;

import org.junit.Test;


public class P760Test {

    private P760 p760 = new P760();

    @Test
    public void test() {
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};
        int[] res = p760.anagramMappings(A, B);
        for (int i : res) {
            System.out.println(i);
        }
    }

}