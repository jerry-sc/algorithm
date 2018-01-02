package leetcode;

public class P69 {

    public int mySqrt(int x) {
        if (x == 0)
            return 0;
        if (x == 1)
            return 1;
        long low = 0, high = x;
        while (low < high) {
            long mid = low + (high - low) / 2;
            if (mid * mid == x)
                return (int) mid;
            else if (mid * mid < x)
                low = mid + 1;
            else
                high = mid;
        }
        return (int) (low - 1);
    }
}
