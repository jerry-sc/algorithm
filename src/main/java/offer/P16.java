package offer;

/**
 * Created on 2018-03-10
 *
 * @author Jerry Shen
 */
public class P16 {

    private static double Power(double base, int exponent) {
        if (exponent ==0) return 1;

        double half = Power(base, exponent >> 1);
        half *= half;
        if ((exponent & 1) == 1) half *= base;
        return half;
    }

    public static void main(String[] args) {
        System.out.println(Power(2,3));
    }
}
