package netease;

import java.util.Scanner;

/**
 * 合唱团:
 * 有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n 个学生中按照顺序选取 k 名学生，要求相邻两个学生的位置编号的差不超过 d，使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？
 */
public class Main6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; ++i) {
            arr[i] = scanner.nextInt();
        }
        int K = scanner.nextInt();
        int d = scanner.nextInt();

        long[][] fMax = new long[K+1][n+1];
        long[][] fMin = new long[K+1][n+1];

        long max = Long.MIN_VALUE;
        for (int i = 1; i <= n; ++i) {
            fMax[1][i] = arr[i];
            fMin[1][i] = arr[i];
            for (int k = 2; k <= K; ++k) {
                for (int j = i-1; j > 0 && i - j <= d; --j) {
                    fMax[k][i] = Math.max(Math.max(fMax[k-1][j] * arr[i], fMin[k-1][j] * arr[i]), fMax[k][i]);
                    fMin[k][i] = Math.min(Math.min(fMax[k-1][j] * arr[i], fMin[k-1][j] * arr[i]), fMin[k][i]);
                }
            }
            max = Math.max(max, fMax[K][i]);
        }
        System.out.println(max);
    }

}
