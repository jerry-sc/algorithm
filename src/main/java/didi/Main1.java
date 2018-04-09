package didi;

import java.util.*;

/**
 * 某餐馆有n张桌子，每张桌子有一个参数：a 可容纳的最大人数； 有m批客人，
 * 每批客人有两个参数:b人数，c预计消费金额。 在不允许拼桌的情况下，请实现一个算法选择其中一部分客人，
 * 使得总预计消费金额最大
 *
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; ++i) {
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);
        List<Pair> pairs = new ArrayList<>(m);
        for (int i = 0; i < m; ++i) {
            Pair pair = new Pair(scanner.nextInt(), scanner.nextInt());
            if (pair.n > num[n-1]) continue;
            pairs.add(pair);
        }
        Collections.sort(pairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.money != o2.money) {
                    return o2.money - o1.money;
                } else {
                    return o1.n - o2.n;
                }
            }
        });
        long res = 0;
        boolean[] used = new boolean[n];
        for (int i = 0; i < pairs.size(); ++i) {
            int pos = search(num, pairs.get(i).n);
            while (pos < n) {
                if (!used[pos]) {
                    res += pairs.get(i).money;
                    used[pos] = true;
                    break;
                }
                ++pos;
            }
        }
        System.out.println(res);
    }

    private static int search(int[] num, int k) {
        int left = 0;
        int right = num.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (num[mid] >= k) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }

    private static class Pair {
        int n;
        int money;
        Pair(int n, int money) {
            this.n = n;
            this.money = money;
        }
    }
}
