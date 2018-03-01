package round2;

public class P459 {

    public boolean repeatedSubstringPattern(String s) {
        char first = s.charAt(0);
        int i = 0,j=0,m=1;
        while (m < s.length()) {
            while (m < s.length() && s.charAt(m) != first) ++m;
            if (m == s.length()) return false;
            j = m;
            int k = 0;
            while (m < s.length() && k < j) {
                if (s.charAt(m) != s.charAt(k)) {
                    break;
                }
                ++m; ++k;
                if (k == j) k = 0;
            }
            if (k ==0 && m == s.length()) return true;
            else m = j+1;
        }
        return false;
    }
}
