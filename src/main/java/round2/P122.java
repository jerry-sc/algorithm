package round2;

/**
 * Created on 2018-01-24
 *
 * @author Jerry Shen
 */
public class P122 {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int sum = 0;
        int pos = prices[prices.length - 1];
        for (int i = prices.length-2; i >= 0; --i) {
            if (prices[i] < pos) {
                sum += pos - prices[i];
            }
            pos = prices[i];
        }
        return sum;
    }
}
