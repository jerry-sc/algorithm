package round2;

/**
 * Created on 2018-03-31
 *
 * @author Jerry Shen
 */
public class P779 {

    public int kthGrammar(int N, int K) {
        return Integer.bitCount(K-1) & 1;
    }
}
