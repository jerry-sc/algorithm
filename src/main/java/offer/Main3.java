package offer;

public class Main3 {

    public boolean find(int[][] array, int k) {
        int j = array[0].length - 1;
        for (int i = 0; i < array.length;) {
            while (j >= 0) {
                if (array[i][j] == k) {
                    return  true;
                } else if (array[i][j] > k) {
                    --j;
                    break;
                } else {
                    ++i;
                    break;
                }
            }
            if (j<0)
                ++i;
        }
        return false;
    }
}
