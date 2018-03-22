package offer;

import java.util.ArrayList;

/**
 * Created on 2018-03-20
 *
 * @author Jerry Shen
 */
public class P29 {

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int row_up = 0, row_down = matrix.length-1, col_left=0, col_right=matrix[0].length-1;
        ArrayList<Integer> res = new ArrayList<>();
        while(row_up <= row_down && col_left <= col_right) {
            for (int i = col_left; i <= col_right; ++i) res.add(matrix[row_up][i]);
            for (int i = row_up+1; i <= row_down;++i) res.add(matrix[i][col_right]);
            if (row_down != row_up)
                for (int i = col_right-1; i >= col_left;--i) res.add(matrix[row_down][i]);
            if (col_left != col_right)
                for (int i = row_down-1; i > row_up; --i) res.add(matrix[i][col_left]);
            ++row_up;
            --row_down;
            ++col_left;
            --col_right;
        }
        return res;
    }
}
