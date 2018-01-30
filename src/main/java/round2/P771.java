package round2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created on 2018-01-29
 *
 * @author Jerry Shen
 */
public class P771 {

    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>(J.length());
        for (int i = 0; i < J.length(); ++i) {
            set.add(J.charAt(i));
        }
        int res = 0;
        for (int i = 0; i < S.length(); ++i) {
            if (set.contains(S.charAt(i))) ++res;
        }
        return res;
    }
}
