package leetcode;

/**
 * Created on 2017-09-11
 *
 * @author Jerry Shen
 */
public class P661 {

    public static void main(String[] args) {
        int[][] a = {{2,3,4},{5,6,7},{8,9,10},{11,12,13},{14,15,16}};
        System.out.println(imageSmoother(a));
    }

    public static int[][] imageSmoother(int[][] M) {

        int row = M.length;
        int col = M[0].length;
        int[][] N = new int[row][col];
        for (int i=0;i< row;++i) {
            for (int j = 0;j<col;++j) {
                int sum = M[i][j];
                int total = 1;
                boolean left = false;
                boolean up = false;
                boolean right = false;
                boolean down = false;

                if (i-1 >= 0)
                    up = true;
                if (i+1 < row)
                    down = true;
                if (j-1>=0)
                    left = true;
                if (j+1 < col)
                    right = true;

                if (up) {
                    ++total;
                    sum += M[i-1][j];
                    if(left) {
                        ++total;
                        sum += M[i-1][j-1];
                    }
                    if(right) {
                        ++total;
                        sum  += M[i-1][j+1];
                    }
                }
                if (down) {
                    ++total;
                    sum += M[i+1][j];
                    if(left) {
                        ++total;
                        sum += M[i+1][j-1];
                    }
                    if(right) {
                        ++total;
                        sum  += M[i+1][j+1];
                    }
                }
                if (left) {
                    ++total;
                    sum += M[i][j-1];
                }
                if (right) {
                    ++total;
                    sum += M[i][j+1];
                }
                N[i][j] = getGray(sum, total);
            }
        }
        return N;
    }


    private static int getGray(int sum, int total) {
        return sum / total;
    }
}
