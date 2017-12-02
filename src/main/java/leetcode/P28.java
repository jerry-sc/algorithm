package leetcode;

public class P28 {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        if (haystack.length() < needle.length())
            return -1;
        int j = 0;
        for (int i=0;i<haystack.length();++i) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                int k = i;
                while (j < needle.length() && k < haystack.length() && needle.charAt(j) == haystack.charAt(k)) {
                    ++j;++k;
                }

                if (j == needle.length())
                    return i;
                else {
                    j = 0;
                }
            }
            if (i + needle.length() >= haystack.length())
                return -1;
        }
        return -1;
    }
}
