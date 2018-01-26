package round2;

/**
 * Created on 2018-01-26
 *
 * @author Jerry Shen
 */
public class P766 {

    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i) {
            int val = matrix[i][0];
            for (int j = i + 1, k = 1; j < matrix.length && k < matrix[0].length;++j,++k) {
                if (matrix[j][k] != val) return false;
            }
        }
        for (int i = 1; i < matrix[0].length; ++i) {
            int val = matrix[0][i];
            for (int j = 1, k = i + 1; j < matrix.length && k < matrix[0].length;++j,++k) {
                if (matrix[j][k] != val) return false;
            }
        }
        return true;
    }
}
