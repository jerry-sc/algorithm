package ctrip;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; ++i) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
            arr[i][2] = scanner.nextInt();
        }
        int adult = scanner.nextInt();
        int child = scanner.nextInt();
        int time = scanner.nextInt();

        int[] choose = new int[n];
        int[] res = new int[n+1];
        res[n] = Integer.MAX_VALUE;
        cal(arr, choose, adult, child, 0, res);
        for (int m : res) System.out.print(m + ",");
    }

    private static void cal(int[][] arr, int[] choose, int adult, int child, int total, int[] res) {
        if (adult <= 0 && child <= 0) {
            if (res[res.length-1] > total) {
                res = Arrays.copyOf(choose, choose.length-1);
                res[res.length-1] = total;
            }
        } else {
            for (int i = 0; i < arr.length; ++i) {
                choose[i] = 1;
                cal(arr, choose, adult - arr[i][0], child - arr[i][1], total + arr[i][2], res);
                choose[i] = 0;
            }
        }
    }
}
