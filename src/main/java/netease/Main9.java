package netease;

import java.util.Scanner;

/**
 * 给你六种面额1、5、10、20、50、100元的纸币，假设每种币值的数量都足够多，编写程序求组成N员（N为0-10000的非负整数）的不同组合的个数。
 */
public class Main9 {

    private static int res = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = {1,5,10,20,50,100};
        helper(arr, 0, n);
        System.out.println(res);
    }

    private static void helper(int[] arr, int index, int target) {
        if (target == 0) {
            ++res;
        } else {
            for (int i = index; i < arr.length; ++i) {
                helper(arr, i , target - arr[i]);
                helper(arr, i + 1, target);
            }
        }
    }
}
