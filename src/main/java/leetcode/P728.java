package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P728 {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i=left;i<=right;++i) {
            int n = i;
            boolean flag = true;
            while (n != 0) {
                int j = n % 10;
                if (j == 0 || i % j != 0) {
                    flag = false;
                    break;
                }
                n /= 10;
            }
            if (flag) {
                list.add(i);
            }
        }
        return list;
    }
}
