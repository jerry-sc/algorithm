package round2;

/**
 * Created on 2018-01-18
 *
 * @author Jerry Shen
 */
public class P693 {

    public boolean hasAlternatingBits(int n) {
        int next = -1;
        while (n != 0) {
            int now = n % 2;
            if (now != next && next != -1) return false;
            next = (now + 1) % 2;
            n /= 2;
        }
        return true;
    }
}
