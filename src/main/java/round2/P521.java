package round2;

/**
 * Created on 2018-01-18
 *
 * @author Jerry Shen
 */
public class P521 {

    public int findLUSlength(String a, String b) {
        if (a.length() != b.length())   return Math.min(a.length(), b.length());
        return a.equals(b) ? 0 : a.length();
    }
}
