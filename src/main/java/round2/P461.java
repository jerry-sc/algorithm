package round2;

public class P461 {

    public int hammingDistance(int x, int y) {
        int tmp = x ^ y;
        int res = 0;
        while (tmp != 0) {
            if (tmp % 2 == 1) ++res;
            tmp /= 2;
        }
        return res;
    }
}
