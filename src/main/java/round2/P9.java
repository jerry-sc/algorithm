package round2;

/**
 * Created on 2018-03-02
 *
 * @author Jerry Shen
 */
public class P9 {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int y = x;
        int res = 0;
        while (y != 0) {
            res = res * 10 + y % 10;
             y /= 10;
        }
        return x ==res;
    }
}
