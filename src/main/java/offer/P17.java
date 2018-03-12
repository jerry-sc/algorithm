package offer;

/**
 * Created on 2018-03-10
 *
 * @author Jerry Shen
 */
public class P17 {

    private static void print1ToMax(int n) {
        int max = 9;
        int i = 1;
        while (i < n) {
            max = max * 10 + max;
        }
    }
}
