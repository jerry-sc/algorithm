package leetcode;

/**
 * 超时方案，时间复杂度 O(n^2)
 */
public class P696 {

    public int countBinarySubstrings(String s) {
        int count = 0;
        for (int i=0;i<s.length()-1;++i) {
            int tmp = 1;
            int j=i+1;

            for (;j<s.length();++j) {
                if (s.charAt(j) == s.charAt(i) && s.charAt(j) == s.charAt(j-1)) {
                    ++tmp;
                } else if (s.charAt(j) != s.charAt(i)){
                    --tmp;
                    if (tmp == 0) {
                        ++count;
                        break;
                    }
                } else {
                    if (tmp!=0)
                        break;
                }
            }
        }
        return count;
    }
}
