package alibaba;

import java.util.Scanner;

public class Main {

    /**
     * @param from 数组A
     * @param to 数组B
     * @return 可能形成数组对应累加值的最小值
     */
    static long min(int[] from, int[] to) {
        int n = to.length;
        long[][] dp = new long[n+1][n+1];
        dp[0][0] = 0;
        for (int i = 1; i <= n; ++i) {
            if (i  % 2 == 0) {
                dp[i][0] = dp[i-2][0] + from[i-2] * from[i-1];
            }
        }
        for (int j = 1; j <= n; ++j) {
            if (j % 2 == 0) {
                dp[0][j] = dp[0][j-2] + to[j-2] * to[j-1];
            }
        }
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                if ((i + j) % 2 == 0) { // 无需考虑奇数的情况
                    // 只有3种情况可以得到dp[i][j], 所以我们只要取三者的最小值即可
                    long num1 = i >= 2 ? dp[i-2][j] + from[i-2] * from[i-1] : Long.MAX_VALUE;
                    long num2 = dp[i-1][j-1] + from[i-1] * to[j-1] ;
                    long num3 = j >= 2 ? dp[i][j-2] + to[j-2] * to[j-1] : Long.MAX_VALUE;
                    dp[i][j] = Math.min(num1, Math.min(num2, num3));
                }
            }
        }
        return dp[n][n];
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long res;

        int _from_size = 0;
        _from_size = Integer.parseInt(in.nextLine().trim());
        int[] _from = new int[_from_size];
        int _from_item;
        for(int _from_i = 0; _from_i < _from_size; _from_i++) {
            _from_item = Integer.parseInt(in.nextLine().trim());
            _from[_from_i] = _from_item;
        }

        int _to_size = 0;
        _to_size = Integer.parseInt(in.nextLine().trim());
        int[] _to = new int[_to_size];
        int _to_item;
        for(int _to_i = 0; _to_i < _to_size; _to_i++) {
            _to_item = Integer.parseInt(in.nextLine().trim());
            _to[_to_i] = _to_item;
        }

        res = min(_from, _to);
        System.out.println(String.valueOf(res));

    }
}