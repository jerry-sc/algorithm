package round2;

/**
 * Created on 2018-02-02
 *
 * @author Jerry Shen
 */
public class P415 {

    public String addStrings(String num1, String num2) {
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        boolean flag = false;
        StringBuilder builder = new StringBuilder();
        while (len1 >= 0 && len2 >= 0) {
            int val = num1.charAt(len1) + num2.charAt(len2) - '0' - '0';
            if (flag) {
                val++;
                flag = false;
            }
            if (val > 9) {
                builder.insert(0, val - 10);
                flag = true;
            } else {
                builder.insert(0, val);
            }
            --len1;
            --len2;
        }
        if (len1 < 0) {
            while (len2 >= 0) {
                if (flag) {
                    int val = num2.charAt(len2) - '0' + 1;
                    if (val == 10)
                        builder.insert(0, 0);
                    else  {
                        builder.insert(0, val);
                        flag = false;
                    }
                } else {
                    builder.insert(0, num2.charAt(len2) - '0');
                }
                --len2;
            }
        }
        if (len2 < 0) {
            while (len1 >= 0) {
                if (flag) {
                    int val = num1.charAt(len1) - '0' + 1;
                    if (val == 10)
                        builder.insert(0, 0);
                    else  {
                        builder.insert(0, val);
                        flag = false;
                    }
                } else {
                    builder.insert(0, num1.charAt(len1) - '0');
                }
                --len1;
            }
        }
        if (flag)   builder.insert(0, 1);
        return builder.toString();
    }
}
