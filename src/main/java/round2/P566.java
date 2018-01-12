package round2;

public class P566 {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if (row * col != r * c) return nums;
        int[][] newNums = new int[r][c];
        int rInd = 0;
        int jInd = 0;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                newNums[rInd][jInd++] = nums[i][j];
                if (jInd == c) {
                    ++rInd;
                    jInd = 0;
                }
            }
        }
        return newNums;
    }
}
