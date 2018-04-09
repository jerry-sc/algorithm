package netease;

import java.util.Scanner;

/**
 * 给你六种面额1、5、10、20、50、100元的纸币，假设每种币值的数量都足够多，编写程序求组成N员（N为0-10000的非负整数）的不同组合的个数。
 */
public class Main9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = {1,5,10,20,50,100};
        long[][] map = new long[arr.length][n+1];
        System.out.println(helper(arr, map, 0, n));
    }

    private static long helper(int[] arr, long[][] map, int index, int target) {
        long res = 0;
        if (index == arr.length) {
            res += target == 0 ? 1 : 0;
        } else {
            for (int i = 0; target - arr[index] * i >= 0; ++i) {
                long value = map[index+1][target-arr[index] * i];
                if (value != 0) {
                    res += value == -1 ? 0 : value;
                } else {
                    res += helper(arr, map, index + 1, target - arr[index] * i);
                }
            }
        }
        map[index][target] = res == 0 ? -1 : res;
        return res;
    }
}
