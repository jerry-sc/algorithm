package round2;

/**
 * Created on 2018-02-05
 *
 * @author Jerry Shen
 */
public class P482 {

    public String licenseKeyFormatting(String S, int K) {
        StringBuilder res = new StringBuilder();
        int j = 0;
        for (int i = S.length() - 1; i >= 0;) {
            while (j < K && i >= 0) {
                char ch = S.charAt(i);
                if (ch != '-') {
                    if (ch >= '0' && ch <= '9') {
                        res.insert(0, ch);
                    } else {
                        res.insert(0, (ch + "").toUpperCase());
                    }
                    ++j;
                }
                --i;
            }
            while (i >= 0 && S.charAt(i) == '-') {
                --i;
            }
            if (i >= 0) {
                res.insert(0, "-");
                j = 0;
            }
        }
        return res.toString();
    }
}
