package round1;

/**
 * Created on 2017-11-28
 *
 * @author Jerry Shen
 */
public class P541 {

    public String reverseStr(String s, int k) {
        int i = 0;
        StringBuilder res = new StringBuilder();
        while (i < s.length()) {
            if (i + k > s.length()) {
                res.append(new StringBuilder(s.substring(i, s.length())).reverse());
            } else if ((i + k) <= s.length()) {
                res.append(new StringBuilder(s.substring(i, i+k)).reverse()).append(s.substring(i+k, Math.min(s.length(), i+2*k)));
            }
            i += 2 * k;
        }
        return res.toString();
    }
}
