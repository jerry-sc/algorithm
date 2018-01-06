package round1;

/**
 * Created on 2017-11-23
 *
 * @author Jerry Shen
 */
public class P521 {

    public int findLUSlength(String a, String b) {
        if (a.length() != b.length())
            return Math.max(a.length(), b.length());
        int max = -1;
        for (int i=0;i<a.length();++i) {
            for (int j=a.length();j>i;--j) {
                String tmp = a.substring(i,j);
                if (!b.contains(tmp)) {
                    if (tmp.length() > max)
                        max = tmp.length();
                }
            }
        }
        return max;
    }
}
