package pat;

import java.util.Scanner;

public class A1003 {

    private static int n, m, c1, c2;

    private static int[] num, w, weight, d;

    private static int[][] G;

    private static boolean[] vis;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        c1 = scanner.nextInt();
        c2 = scanner.nextInt();
        weight = new int[n];
        num = new int[n];
        w = new int[n];
        vis = new boolean[n];
        for (int i = 0; i < n; ++i) {
            weight[i] = scanner.nextInt();
        }
        G = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                G[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < m; ++i) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            G[u][v] = w;
            G[v][u] = w;
        }
        d = new int[n];
        for (int i = 0; i < n; ++i) {
            d[i] = Integer.MAX_VALUE;
        }
        dijkstra(c1);
        System.out.println(num[c2]);
        System.out.println(w[c2]);
    }

    private static void dijkstra(int c1) {
        d[c1] = 0;
        num[c1] = 1;
        w[c1] = weight[c1];
        for (int i = 0; i < n; ++i) {
            int u = -1, min = Integer.MAX_VALUE;
            for (int j = 0; j < n; ++j) {
                if (!vis[j] && d[j] < min) {
                    min = d[j];
                    u = j;
                }
            }
            if (u == -1) return;
            vis[u] = true;
            for (int j = 0; j < n; ++j) {
                if (!vis[j] && G[u][j] != Integer.MAX_VALUE) {
                    if (d[j] > d[u] + G[u][j]) {
                        d[j] = d[u] + G[u][j];
                        w[j] = w[u] + weight[j];
                        num[j] = num[u];
                    } else if (d[j] == d[u] + G[u][j]) {
                        num[j] += num[u];
                        if (w[j] < w[u] + weight[j]) {
                            w[j] = w[u] + weight[j];
                        }
                    }
                }
            }
        }
    }
}
