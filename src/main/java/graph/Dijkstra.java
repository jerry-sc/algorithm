package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created on 2018-03-26
 *
 * @author Jerry Shen
 */
public class Dijkstra {

    private static class Node {
        int v, dis;
        Node(int v, int dis) {
            this.v = v;
            this.dis = dis;
        }
    }

    private static List<Node>[] adj;

    private static int n, m, s;

    private static boolean[] vis;

    private static int[] d;

    private static int[] pre;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        s = scanner.nextInt();

        adj = new ArrayList[n];

        vis = new boolean[n];
        d = new int[n];
        pre = new int[n];
        for (int i = 0; i < n; ++i) {
            d[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; ++i) {
            pre[i] = i;
        }
        for (int i = 0; i < m; ++i) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            if (adj[u] == null) {
                adj[u] = new ArrayList<>();
            }
            adj[u].add(new Node(v, w));
        }
        dijkstra(s);
        for (int i = 0; i < n; ++i) {
            System.out.println(d[i]);
        }
    }

    private static void dijkstra(int s) {
        d[s] = 0;
        for (int i = 0; i < n; ++i) {
            int u = -1, min = Integer.MAX_VALUE;
            for (int j = 0; j < n; ++j) {
                if (vis[j] == false && d[j] < min) {
                    min = d[j];
                    u = j;
                }
            }
            if (u == -1) return;
            vis[u] = true;
            for (int j = 0; adj[u] != null && j < adj[u].size(); ++j) {
                int v = adj[u].get(j).v;
                if (vis[v] == false && d[v] > d[u] + adj[u].get(j).dis) {
                    d[v] = d[u] + adj[u].get(j).dis;
                    pre[v] = u;
                }
            }
        }
    }

    private void dfs(int s, int v) {
        if (v == s) {
            System.out.println(s); return;
        }
        dfs(s, pre[v]);
        System.out.println(v);
    }
}
