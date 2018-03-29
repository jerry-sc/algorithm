package demo;

import java.util.Scanner;

/**
 * 最长回文子串
 *
 * @author Jerry Shen
 */
public class LH {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int[][] dp = new int[str.length()][str.length()];
        int ans = 1;
        for (int i = 0; i < str.length(); ++i) {
            dp[i][i] = 1;
            if (i < str.length() - 1) {
                if (str.charAt(i) == str.charAt(i+1)) {
                    dp[i][i+1] = 1;
                    ans = 2;
                }
            }
        }
        for (int L = 3; L <= str.length(); ++L) {
            for (int i = 0; i + L -1 < str.length(); ++i) {
                int j = i + L - 1;
                if (str.charAt(i) == str.charAt(j) && dp[i+1][j-1] == 1) {
                    dp[i][j] = 1;
                    ans = L;
                }
            }
        }
        System.out.println(ans);
    }
}
