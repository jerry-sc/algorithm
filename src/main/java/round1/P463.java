package round1;

/**
 * Created on 2017-11-10
 *
 * @author Jerry Shen
 */
public class P463 {

    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == 1) {
                    // left
                    if (j == 0 || grid[i][j-1] == 0) {
                        ++count;
                    }
                    // right
                    if (j == grid[0].length - 1 || grid[i][j+1] == 0) {
                        ++count;
                    }
                    // up
                    if (i == 0 || grid[i-1][j] == 0) {
                        ++count;
                    }
                    // down
                    if (i == grid.length -1 || grid[i+1][j] == 0) {
                        ++count;
                    }
                }
            }
        }
        return count;
    }
}
