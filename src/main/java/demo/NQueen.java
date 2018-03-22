package demo;

/**
 * Created on 2018-03-21
 *
 * @author Jerry Shen
 */
public class NQueen {

    static final int MAX_NUM = 8;

    private int chessBoard[][] = new int[MAX_NUM][MAX_NUM];

    private boolean check(int x, int y) {
        for (int i = 0; i < y; ++i) {
            // 纵向检查
            if (chessBoard[x][i] == 1) return false;
            // 检查左侧斜向
            if (x-1-i >= 0 && chessBoard[x-1-i][y-1-i] == 1) return false;
            // 检测右侧斜向
            if (x+1+i < MAX_NUM && chessBoard[x+1+i][y-1-i] == 1) return false;
        }
        return true;
    }

    private boolean settleQueen(int y) {
        if (y == MAX_NUM) return true;

        for (int i = 0; i < MAX_NUM;++i) {
            // 为当前行清空，以免在回溯的时候出现脏数据
            for (int x = 0; x < MAX_NUM; ++x) {
                chessBoard[x][y] = 0;
            }
            if (check(i, y)) {
                chessBoard[i][y] = 1;
                if (settleQueen(y+1))   // 如果下一层找不到位置，那么当前层重新向后找一个位置，继续
                    return true;
            }
        }
        return false;
    }
}
