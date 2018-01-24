package round2;

public class P598 {

    public int maxCount(int m, int n, int[][] ops) {
        int rMax = m, cMax = n;
        for (int i = 0; i< ops.length; ++i) {
            if (ops[i][0] < rMax)   rMax = ops[i][0];
            if (ops[i][1] < cMax)   cMax = ops[i][1];
        }
        return rMax * cMax;
    }
}
