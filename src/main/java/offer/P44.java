package offer;

/**
 * Created on 2018-03-22
 *
 * @author Jerry Shen
 */
public class P44 {

    public int digitAtIndex(int index) {
        int digit = 1;
        while (true) {
            int numbers = countOfIntegers(digit);
            if (index < numbers) return get(index, digit);
            index -= numbers * digit;
            ++digit;
        }
    }

    private int get(int index, int digit) {
        int first = digit == 1 ? 0 : (int) Math.pow(10, digit-1);
        int number = first + index / digit;
        int indexFromRight = digit - index % digit;
        for (int i = 1; i < indexFromRight; ++i) {
            number /= 10;
        }
        return number % 10;
    }

    private int countOfIntegers(int digits) {
        if (digits == 1) return 10;
        return 9 * (int)Math.pow(10, digits - 1);
    }
}
