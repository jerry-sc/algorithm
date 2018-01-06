package round2;

public class P476 {

    public int findComplement(int num) {
        int res = 0;
        int index = 1;
        while (num != 0) {
            int bit = num % 2;
            num /= 2;
            if (bit == 0)
                res += index;
            index *= 2;
        }
        return res;
    }
}
