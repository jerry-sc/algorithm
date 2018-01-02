package leetcode;

public class P695 {

    boolean[][] visited;
    int[][] grid;

    private int dfs(int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || visited[i][j])
            return 0;
        visited[i][j] = true;
        return 1 + dfs(i - 1, j) + dfs(i + 1, j) + dfs(i, j-1) + dfs(i, j + 1);
    }

    public int maxAreaOfIsland(int[][] grid) {
        visited = new boolean[grid.length][grid[0].length];
        this.grid = grid;
        int max = 0;
        for (int i=0;i<grid.length;++i) {
            for (int j=0;j<grid[0].length;++j) {
                max = Math.max(dfs(i , j), max);
            }
        }
        return max;
    }
}
