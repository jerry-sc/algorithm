package round2;

/**
 * Created on 2018-01-20
 *
 * @author Jerry Shen
 */
public class P696 {

    public int countBinarySubstrings(String s) {
        int sum = 0;
        int count = 1;
        int pre = 0;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == s.charAt(i-1)) {
                ++count;
                --pre;
                if (pre == 0) ++sum;
            } else {
                if (pre > 0) ++sum;
                ++sum;
                pre = count-1;
                count = 1;
            }
        }
        return sum;
    }
}
