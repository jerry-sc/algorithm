package round2;

/**
 * Created on 2018-01-28
 *
 * @author Jerry Shen
 */
public class P661 {

    int sum;
    int count;

    public int[][] imageSmoother(int[][] M) {
        int[][] res = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; ++i) {
            for (int j = 0; j < M[0].length; ++j) {
                res[i][j] = cal(M, i, j);
            }
        }
        return res;
    }

    private int cal(int[][] M, int i, int j) {
        sum = M[i][j];
        count = 1;
        get(M, i - 1, j);
        get(M, i +1, j);
        get(M, i, j-1);
        get(M, i, j+1);
        get(M, i-1, j-1);
        get(M,  i-1, j+1);
        get(M, i+1, j+1);
        get(M, i+1, j-1);
        return sum / count;
    }

    private void get(int[][] M, int i, int j) {
        if (i < 0 || i >= M.length || j < 0 || j >= M[0].length)    return;
        ++count;
        sum += M[i][j];
    }
}
