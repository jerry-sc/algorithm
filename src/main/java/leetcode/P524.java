package leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P524 {

    public String findLongestWord(String s, List<String> d) {
        Collections.sort(d, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int tmp = o2.length() - o1.length();
                if (tmp == 0) {
                    return o1.compareTo(o2);
                } else
                    return tmp;
            }
        });

        for (String word : d) {
            int last =0;
            int i=0;
            for (;i<word.length();++i) {
                int index = s.indexOf(word.charAt(i), last);
                if (index == -1)
                    break;
                last = index + 1;
            }
            if (i == word.length())
                return word;
        }
        return "";
    }
}
