package pinduoduo;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 2) {
            System.out.println(0);
            return;
        }
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; ++i) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        double[][] G = new double[n][n];
        cal(G, arr);
        int count = 0;
        for (int i = 0; i < n -2; ++i) {
            for (int j = i + 1; j < n-1; ++j) {
                for(int k = j + 1; k < n; ++k) {
                    if (isTri(G, i, j, k)) ++count;
                }
            }
        }
        System.out.println(count);
    }

    private static boolean isTri(double[][] G, int i, int j, int k) {
        return G[i][j] + G[i][k] > G[j][k] && G[i][j] + G[j][k] > G[i][k] && G[i][k] + G[j][k] > G[i][j];
    }

    private static void cal(double[][] G, int[][] arr) {
        for (int i = 0; i < G.length; ++i) {
            for (int j = 0; j < G.length; ++j) {
                double tmp = (arr[i][0] - arr[j][0]) * (arr[i][0] - arr[j][0]) + (arr[i][1] - arr[j][1]) * (arr[i][1] - arr[j][1]);
                G[i][j] = Math.sqrt(tmp);
                G[j][i] = G[i][j];
            }
        }
    }


}
