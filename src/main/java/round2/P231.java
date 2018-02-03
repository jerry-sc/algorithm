package round2;

/**
 * Created on 2018-02-03
 *
 * @author Jerry Shen
 */
public class P231 {

    public boolean isPowerOfTwo(int n) {
        int a = 2;
        while (a < n && a >0) {
            a *= 2;
        }
        return a == n || n == 1;
    }
}
