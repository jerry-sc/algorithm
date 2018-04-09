package haoweilai;

import java.util.Scanner;

/**
 * 读入一个字符串str，输出字符串str中的连续最长的数字串
 *
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int i = 0;
        int max = -1;
        int start = -1, end = -1;
        while (i < str.length()) {
            while (i < str.length() && !Character.isDigit(str.charAt(i))) {
                ++i;
            }
            if (i == str.length()) {
                break;
            }
            int count = 0;
            int tmp_start = i;
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                ++count;
                ++i;
            }
            int tmp_end = i;
            if (count > max) {
                start = tmp_start;
                end = tmp_end;
                max = count;
            }
        }
        System.out.println(str.substring(start, end));
    }
}
