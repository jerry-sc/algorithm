package didi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 小青蛙有一天不小心落入了一个地下迷宫,小青蛙希望用自己仅剩的体力值P跳出这个地下迷宫。为了让问题简单,假设这是一个n*m的格子迷宫,
 * 迷宫每个位置为0或者1,0代表这个位置有障碍物,小青蛙达到不了这个位置;1代表小青蛙可以达到的位置。小青蛙初始在(0,0)位置,
 * 地下迷宫的出口在(0,m-1)(保证这两个位置都是1,并且保证一定有起点到终点可达的路径),小青蛙在迷宫中水平移动一个单位距离需要消耗1点体力值,
 * 向上爬一个单位距离需要消耗3个单位的体力值,向下移动不消耗体力值,当小青蛙的体力值等于0的时候还没有到达出口,小青蛙将无法逃离迷宫。
 * 现在需要你帮助小青蛙计算出能否用仅剩的体力值跳出迷宫(即达到(0,m-1)位置)。
 */
public class Main5 {

    private static int max = -1;

    private static List<Point> res = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int[][] map = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                map[i][j] = scanner.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        dfs(map, visited, 0, 0, p, new ArrayList<>());
        if (max > -1) {
            for (int i = 0; i < res.size(); ++i) {
                if (i == 0) {
                    System.out.print("[" + res.get(i).x + "," + res.get(i).y + "]");
                } else {
                    System.out.print(",[" + res.get(i).x + "," + res.get(i).y + "]");
                }
            }
            System.out.println();
        } else {
            System.out.println("Can not escape!");
        }
    }

    private static void dfs(int[][] map, boolean[][] visited, int i, int j, int p, List<Point> path1) {
        if (i < 0 || j < 0 || i >= map.length || j >= map[0].length || map[i][j] == 0 || visited[i][j] || p < 0) return;
        visited[i][j] = true;
        path1.add(new Point(i, j));
        if (i == 0 && j == map[0].length -1 && p >= 0) {
            if (p > max) {
                max = p;
                res = path1;
            }
            visited[i][j] = false;
            return;
        }
        List<Point> path2 = new ArrayList<>(path1);
        List<Point> path3 = new ArrayList<>(path1);
        List<Point> path4 = new ArrayList<>(path1);
        dfs(map, visited, i + 1, j, p, path1);
        dfs(map, visited, i - 1, j, p -3, path2);
        dfs(map, visited, i, j-1, p - 1, path3);
        dfs(map, visited, i, j + 1, p-1, path4);
        visited[i][j] = false;
    }

    private static class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
