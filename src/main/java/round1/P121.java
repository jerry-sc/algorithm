package round1;

public class P121 {

    public int maxProfit(int[] prices) {
        int max = 0;
        int pre = 0;
        for (int i = 1; i < prices.length; ++i) {
            pre = Math.max(prices[i] - prices[i-1] + pre, 0);
            max = Math.max(max, pre);
        }
        return max;
    }
}
