package didi;

import java.util.Scanner;

/**
 * 给定一个有n个正整数的数组A和一个整数sum,求选择数组A中部分数字和为sum的方案数。
    当两种选取方案有一个数字的下标不一样,我们就认为是不同的组成方案。
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; ++i) {
            num[i] = scanner.nextInt();
        }
        long[][] dp = new long[n][m+1];
        for (int i = 0; i < dp.length; ++i) {
            dp[i][0] = 1;
        }
        dp[0][num[0]] = 1;
        for (int i = 1; i < dp.length; ++i) {
            for (int j = 1; j < dp[0].length; ++j) {
                if (j-num[i] >= 0)
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-num[i]];
            }
        }
        System.out.println(dp[n-1][m]);
    }
}

