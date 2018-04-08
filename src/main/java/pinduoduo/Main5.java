package pinduoduo;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 2) {
            System.out.println(0);
            return;
        }
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; ++i) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        double[][] G = new double[n][n];
        int count = 0;
        for (int i = 0; i < n -2; ++i) {
            for (int j = i + 1; j < n-1; ++j) {
                for(int k = j + 1; k < n; ++k) {

                }
            }
        }
        System.out.println(count);
    }



}
