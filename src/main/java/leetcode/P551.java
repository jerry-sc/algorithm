package leetcode;

/**
 * Created on 2017-11-28
 *
 * @author Jerry Shen
 */
public class P551 {

    public boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        for (int i=0;i<s.length();++i) {
            switch (s.charAt(i)) {
                case 'A':
                    ++a;
                    break;
                case 'L':
                    if (i > 0 && s.charAt(i-1) == 'L')
                        ++l;
                    else
                        l = 1;
            }
            if (a > 1 || l > 2)
                return false;
        }
        return true;
    }
}
