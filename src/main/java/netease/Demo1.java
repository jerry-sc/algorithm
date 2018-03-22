package netease;

/**
 * Created on 2018-03-21
 *
 * @author Jerry Shen
 */
public class Demo1 {

    public int minCount(int x, int y, int z, int start, int end) {
        int count = 0;
        if (start % 2 == 1) {
            count += y;
            start *= 2;
        }
        while (start > end) {
            count += z;
            --start;
        }
        if (start == end) return count;
        int doub = start << 1;
        int num = (doub - start) / 2 * x;
        if (num < y) {
            count = count + (end - start) / 2 * x;
            return count;
        } else {
            while (start < end) {
                start *= 2;
                count += y;
            }
            if (start == end) return count;
            int a = count - y + (end - start / 2) / 2 * x;
            int b = count + (start - end) / 2 * z;
            return a < b ? a : b;
        }
    }
}
