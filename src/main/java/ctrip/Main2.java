package ctrip;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt(10)) {
            list.add(scanner.nextInt());
        }
        int n = (int) Math.sqrt(list.size());
        int[][] arr = new int[n][n];
        int k = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = list.get(k++);
            }
        }

        for (int i = 0; i < n;++i) {
            for (int j = n-1; j >= 0; --j) {
                if (j == 0)
                    System.out.print(arr[j][i]);
                else
                    System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
