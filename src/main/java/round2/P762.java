package round2;

/**
 * Created on 2018-01-18
 *
 * @author Jerry Shen
 */
public class P762 {

    public int countPrimeSetBits(int L, int R) {
        int sum = 0;
        for (int i = L; i <= R; ++i) {
            int count = 0;
            int tmp = i;
            while (tmp != 0) {
                if (tmp % 2 == 1)   ++count;
                tmp /= 2;
            }
            if (isPrime(count)) ++sum;
        }
        return sum;
    }

    private boolean isPrime(int k) {
        if (k == 1) return false;
        for (int i = 2; i <= Math.sqrt(k); ++i) {
            if (k % i == 0) return false;
        }
        return true;
    }
}
