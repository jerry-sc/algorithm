package round2;

/**
 * Created on 2018-03-02
 *
 * @author Jerry Shen
 */
public class P441 {

    public int arrangeCoins(int n) {
        long left = 1, right = (long)n+1;
        while (left < right) {
            long mid = left + (right - left) / 2;
            mid = mid > (2 << 16) ? 2 << 16 : mid;
            long value = (1 + mid) * mid / 2;
            if (value <= n) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return (int) (left - 1);
    }
}
