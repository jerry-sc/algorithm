package round2;

/**
 * Created on 2018-01-29
 *
 * @author Jerry Shen
 */
public class P504 {

    public String convertToBase7(int num) {
        if (num == 0)   return "0";
        StringBuilder builder = new StringBuilder();
        boolean flag = false;
        if (num < 0) {
            num = -num;
            flag = true;
        }
        while (num != 0) {
            builder.append(num % 7);
            num /= 7;
        }
        if (flag) builder.append("-");
        return builder.reverse().toString();
    }
}
