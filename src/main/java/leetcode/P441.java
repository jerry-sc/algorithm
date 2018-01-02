package leetcode;

public class P441 {

    public int arrangeCoins(int n) {
        return (int) ((-1 + Math.sqrt(1 + 8*n)) / 2);
    }

}
