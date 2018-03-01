package round2;

import java.util.ArrayList;
import java.util.List;

public class P66 {

    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>(digits.length+1);
        int flag = 0;
        digits[digits.length-1]++;
        for (int i = digits.length-1; i >= 0; --i){
            flag = digits[i] / 10;
            list.add(0, digits[i] % 10);
            if (i == 0) {
                if (list.get(0) == 0)
                    list.add(0, 1);
            } else digits[i-1] += flag;
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; ++i) res[i] = list.get(i);
        return res;
    }
}
