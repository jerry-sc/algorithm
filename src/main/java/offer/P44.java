package offer;

/**
 * Created on 2018-03-22
 *
 * @author Jerry Shen
 */
public class P44 {

    public int digitIndex(int index) {
        if (index < 0) return -1;
        int digits = 1;
        while (true) {
            int numbers = countOfIntegers(digits);
            if (index < numbers * digits) {
                return digitIndex(index, digits);
            }
            index -= numbers*digits;
            ++digits;
        }
    }

    private int digitIndex(int index, int digits) {
        int num = beginNum(digits) + index / digits;
        int indexFromRight = digits - index % digits;
        for (int i = 0; i < indexFromRight;++i) {
            num /= 10;
        }
        return num % 10;
    }

    private int beginNum(int digits) {
        if (digits == 1) return 0;
        return (int) Math.pow(10, digits - 1);
    }

    /**
     * 计算M位的数字共有多少个
     * @param digits
     * @return
     */
    private int countOfIntegers(int digits) {
        if (digits == 1) return 10;
        return (int) (9 * Math.pow(10, digits - 1));
    }
}
