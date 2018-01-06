package round1;

public class P598 {

    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) {
            return m*n;
        }
        int i = ops[0][0];
        int j = ops[0][1];
        for (int k=1;k<ops.length;++k) {
            if (i > ops[k][0]) {
                i = ops[k][0];
            }
            if (j > ops[k][1]) {
                j = ops[k][1];
            }
        }
        return i*j;
    }
}
