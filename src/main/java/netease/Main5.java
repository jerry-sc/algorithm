package netease;

import java.util.Scanner;

/**
 * Created on 2018-03-29
 *
 * @author Jerry Shen
 */
public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= l; ++i) {
            sum += i;
            sum %= 3;
        }
        int res = 0;
        while (l <= r) {
            res += sum == 0 ? 1 : 0;
            sum += (++l);
            sum %= 3;
        }
        System.out.println(res);
    }
}
