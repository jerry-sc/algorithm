package round2;

public class P367 {

    public boolean isPerfectSquare(int num) {
        int left = 1, right = num;
        while (left <= right) {
            int mid = left + (right - left) /  2;
            mid = mid > 100000 ? 100000 : mid;
            long val = (long)mid * mid;
            if (val == num) return true;
            else if (val > num || val < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
