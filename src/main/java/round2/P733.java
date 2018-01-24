package round2;

public class P733 {

    boolean[][] visited;
    int newColor;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        visited = new boolean[image.length][image[0].length];
        this.newColor = newColor;
        dfs(sr, sc, image, image[sr][sc]);
        return image;
    }

    private void dfs(int i, int j, int[][] image, int oriColor) {
        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length || visited[i][j] || image[i][j] != oriColor)
            return;
        visited[i][j] = true;
        image[i][j] = newColor;
        dfs(i-1, j, image, oriColor);
        dfs(i + 1, j, image, oriColor);
        dfs(i, j-1, image, oriColor);
        dfs(i, j + 1, image, oriColor);
    }

}
