package round2;

import java.util.HashSet;
import java.util.Set;

public class P345 {

    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('o');
        set.add('u');
        set.add('i');
        set.add('A');
        set.add('E');
        set.add('O');
        set.add('I');
        set.add('U');
        int i = 0, j = s.length()-1;
        char[] str = s.toCharArray();
        while (i < j) {
            while (i < j && !set.contains(s.charAt(i))) {
                str[i] = s.charAt(i);
                ++i;
            }
            while (i < j && !set.contains(s.charAt(j))) {
                str[j] = s.charAt(j);
                --j;
            }
            if (i < j) {
                str[i] = s.charAt(j);
                str[j] = s.charAt(i);
                ++i;--j;
            }
        }
        return new String(str);
    }
}
