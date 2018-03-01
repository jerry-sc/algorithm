package round2;

import java.util.ArrayList;
import java.util.List;

public class P118 {

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>(numRows);
        List<Integer> first =new ArrayList<>(1);
        first.add(1);
        res.add(first);
        for (int i = 1; i < numRows; ++i) {
            List<Integer> tmp = new ArrayList<>(i+1);
            for (int j = 0; j <= i; ++j) {
                if (j == 0) tmp.add(1);
                else if (j == i) tmp.add(1);
                else {
                    List<Integer> pre = res.get(i-1);
                    if (j < pre.size())
                        tmp.add(pre.get(j-1) + pre.get(j));
                }
            }
            res.add(tmp);
        }
        return res;
    }
}
