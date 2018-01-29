package round2;

/**
 * Created on 2018-01-29
 *
 * @author Jerry Shen
 */
public class P551 {

    public boolean checkRecord(String s) {
        int a = 0, l = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'L') {
                ++l;
                if (i != 0 ) {
                    if (s.charAt(i-1) == 'L') {
                        if (l > 2)  return false;
                    }else l = 1;
                }
            }
            else if (s.charAt(i) == 'A'){
                ++a;
                if (a > 1)  return false;
            }
        }
        return true;
    }
}
