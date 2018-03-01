package round2;

import java.util.ArrayList;
import java.util.List;

public class P784 {

    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        res.add("");
        S = S.toLowerCase();
        for (int i = 0; i < S.length(); ++i) {
            char low = S.charAt(i);
            List<String> tmp = new ArrayList<>();
            if (low >= 'a' && low <= 'z') {
                char up = (char) (low - 32);
                for (String s : res) {
                    tmp.add(s + low);
                    tmp.add(s+ up);
                }
            } else {
                for (String s : res) {
                    tmp.add(s + low);
                }
            }
            res = tmp;
        }
        return res;
    }
}
