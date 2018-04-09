package didi;

import java.util.Scanner;

/**
 * 输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;
        while (n != 0) {
            res += n / 5;
            n /= 5;
        }
        System.out.println(res);
    }
}
