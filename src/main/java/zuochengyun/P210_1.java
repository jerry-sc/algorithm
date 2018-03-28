package zuochengyun;

import java.util.Scanner;

/**
 * 最长公共子序列问题
 *
 * @author Jerry Shen
 */
public class P210_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        int[][] dp = new int[str1.length()][str2.length()];
        getDP(str1.toCharArray(), str2.toCharArray(), dp);
        getLongest(str1.toCharArray(), str2.toCharArray(), dp);
    }

    private static String getLongest(char[] str1, char[] str2, int[][] dp) {
        int m = str1.length - 1;
        int n = str2.length - 1;
        char[] res = new char[dp[str1.length-1][str2.length-1]];
        int index = res.length - 1;
        while (index >= 0) {
            if (n > 0 && dp[m][n] == dp[m][n-1]) {
                --n;
            } else if (m > 0 && dp[m][n] == dp[m-1][n]) {
                --m;
            } else {
                res[index--] = str1[m];
                --m;--n;
            }
        }
        return new String(res);
    }

    private static void getDP(char[] str1, char[] str2, int[][] dp){
        dp[0][0] = str1[0] == str2[0] ? 1 : 0;
        for (int i = 1; i < str1.length; ++i) {
            dp[i][0] = Math.max(dp[i-1][0], str1[i] == str2[0] ? 1 : 0);
        }
        for (int j = 1; j < str2.length; ++j) {
            dp[0][j] = Math.max(dp[0][j-1], str2[j] == str1[0] ? 1 : 0);
        }
        for (int i = 1; i < str1.length; ++i) {
            for (int j = 1; j < str2.length; ++j) {
                int tmp = Math.max(dp[i][j-1], dp[i-1][j]);
                if (str1[i] == str2[j])
                    dp[i][j] = Math.max(dp[i-1][j-1] + 1, tmp);
            }
        }
    }
}
