package round2;

/**
 * Created on 2018-01-29
 *
 * @author Jerry Shen
 */
public class P541 {
    public String reverseStr(String s, int k) {
        int len = s.length();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < len;) {
            int j = 0, mark = i;
            while (i < len && j < k) {
                res.insert(mark, s.charAt(i));
                ++j;++i;
            }
            j = 0;
            while (i < len && j < k) {
                res.append(s.charAt(i));
                ++j;++i;
            }
        }
        return res.toString();
    }
}
