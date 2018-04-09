package didi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 给定一个十进制数M，以及需要转换的进制数N。将十进制数M转化为N进制数
 */
public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        List<Character> list = new ArrayList<>();
        boolean flag = m <= 0;
        m = Math.abs(m);
        while (m != 0) {
            int tmp = m % n;
            if (tmp < 10) {
                list.add((char) ('0' + tmp));
            } else {
                list.add((char) ('A' + tmp - 10));
            }
            m /= n;
        }
        StringBuilder res = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; --i) {
            res.append(list.get(i));
        }
        if (flag) res.insert(0, '-');
        System.out.println(res.toString());
    }
}
