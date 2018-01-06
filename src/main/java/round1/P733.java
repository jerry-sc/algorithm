package round1;

public class P733 {

    boolean[][] visited;
    int find;
    int newColor;
    int[][] image;

    private void dfs(int i, int j) {
        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length || visited[i][j] || image[i][j] != find)
            return;
        visited[i][j] = true;
        image[i][j] = newColor;
        dfs(i-1, j);
        dfs(i + 1, j);
        dfs(i,j-1);
        dfs(i, j+1);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        visited = new boolean[image.length][image[0].length];
        this.find = image[sr][sc];
        this.newColor = newColor;
        this.image = image;
        dfs(sr, sc);
        return this.image;
    }
}
