package round2;

/**
 * Created on 2018-02-03
 *
 * @author Jerry Shen
 */
public class P326 {

    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}
