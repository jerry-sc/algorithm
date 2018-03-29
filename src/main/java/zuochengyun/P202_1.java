package zuochengyun;

import java.util.Scanner;

/**
 * 最长递增子序列
 *
 * @author Jerry Shen
 */
public class P202_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
        }
        int[] dp = new int[n];
        getDP(arr, dp);
        int[] res = getArr(arr, dp);
        for (int a : res) {
            System.out.print(a + " ");
        }
    }

    private static int[] getArr(int[] arr, int[] dp) {
        int len = 0;
        int index = 0;
        for (int i = 0; i < dp.length; ++i) {
            if (dp[i] > len) {
                len = dp[i];
                index = i;
            }
        }
        int[] res = new int[len];
        res[--len] = arr[index];
        for (int i = index - 1; i >= 0; --i) {
            if (dp[i] == dp[index] - 1) {
                res[--len] = arr[i];
                index = i;
            }
        }
        return res;
    }

    private static void getDP(int[] arr, int[] dp) {
        dp[0] = 1;
        for (int i = 1; i < arr.length; ++i) {
            int j = i - 1;
            while (j >= 0 && arr[i] < arr[j]) {
                --j;
            }
            if (j < 0) dp[i] = 1;
            else dp[i] = dp[j] + 1;
        }
    }
}
