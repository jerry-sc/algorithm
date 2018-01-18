package round2;

/**
 * Created on 2018-01-18
 *
 * @author Jerry Shen
 */
public class P463 {

    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == 1) {
                    // up
                    if (i == 0) ++sum;
                    else if (grid[i-1][j] == 0) ++sum;
                    // down
                    if (i == grid.length - 1) ++sum;
                    else if (grid[i+1][j] == 0) ++sum;
                    //left
                    if (j == 0) ++sum;
                    else if (grid[i][j-1] == 0) ++sum;
                    // right
                    if (j == grid[0].length - 1) ++sum;
                    else if (grid[i][j+1] == 0) ++sum;
                }
            }
        }
        return sum;
    }
}
