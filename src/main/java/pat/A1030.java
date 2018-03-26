package pat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1030 {

    private static int n,m,s,t;

    private static int[][] G, cost;

    private static int[] d;

    private static boolean[] vis;

    private static List<List<Integer>> pre;

    private static List<Integer> tmpPath, path;

    private static int minCost = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        s = scanner.nextInt();
        t = scanner.nextInt();
        G = new int[n][n];
        cost = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                G[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < m; ++i) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int dis = scanner.nextInt();
            int c = scanner.nextInt();
            G[u][v] = dis;
            G[v][u] = dis;
            cost[u][v] = c;
            cost[v][u] = c;
        }
        d = new int[n];
        for (int i = 0; i < n; ++i)
            d[i] = Integer.MAX_VALUE;
        vis = new boolean[n];
        pre = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) {
            pre.add(new ArrayList<>());
        }
        tmpPath = new ArrayList<>();
        path = new ArrayList<>();
        dijkstra(s);
        dfs(t);
        for (int i = path.size() - 1; i >= 0; --i) {
            System.out.println(path.get(i));
        }
        System.out.println(minCost);
    }

    private static void dijkstra(int s) {
        d[s] = 0;
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
            for (int v = 0; v < n; ++v) {
                if (!vis[v] && G[u][v] != Integer.MAX_VALUE) {
                    if (d[v] > d[u] + G[u][v]) {
                        d[v] = d[u] + G[u][v];
                        pre.get(v).clear();
                        pre.get(v).add(u);
                    } else if (d[v] == d[u] + G[u][v]) {
                        pre.get(v).add(u);
                    }
                }
            }
        }
    }

    private static void dfs(int v) {
        if (v == s) {
            tmpPath.add(v);
            int tempCost = 0;
            for (int i = tmpPath.size() - 1; i >0; --i) {
                int id = tmpPath.get(i), nextId = tmpPath.get(i-1);
                tempCost += cost[id][nextId];
            }
            if (tempCost < minCost) {
                path = new ArrayList<>(tmpPath);
//                for (int i = path.size() - 1; i >= 0;--i) {
//                    System.out.println(path.get(i));
//                }
                minCost = tempCost;
            }
            tmpPath.remove(tmpPath.size() - 1);
            return;
        }
        tmpPath.add(v);
        for (int i = 0; i < pre.get(v).size(); ++i) {
            dfs(pre.get(v).get(i));
        }
        tmpPath.remove(tmpPath.size() - 1);
    }
}
