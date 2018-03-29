package zuochengyun;

import java.util.Scanner;

/**
 * Created on 2018-03-27
 *
 * @author Jerry Shen
 */
public class P196_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n; ++i) {
            arr[i] = scanner.nextInt();
        }
        int aim = scanner.nextInt();
        System.out.println(coins(arr, 0, aim));
    }

    private static int coins(int[] arr, int index, int aim) {
        if (index == arr.length) {
            return aim == 0 ? 1 : 0;
        } else {
            int res = 0;
            for (int i = 0; aim - arr[index] * i >= 0; ++i) {
                res += coins(arr, index + 1, aim - arr[index] * i);
            }
            return res;
        }
    }
}
