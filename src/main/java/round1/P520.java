package round1;

/**
 * Created on 2017-11-23
 *
 * @author Jerry Shen
 */
public class P520 {
    public boolean detectCapitalUse(String word) {
        boolean flag = true;
        boolean first = isCapital(word.charAt(0));
        for (int i=1;i<word.length();++i) {
            if (first) {
                if (isCapital(word.charAt(i))) {
                    if (!flag)
                        return false;
                } else {
                    if (isCapital(word.charAt(1)))
                        return false;
                    flag = false;
                }
            } else {
                if (isCapital(word.charAt(i)))
                    return false;
            }
        }
        return true;
    }

    private boolean isCapital(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }
}
