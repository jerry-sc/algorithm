package ctrip;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = scanner.nextInt();
        int i =  0;
        for (int j = 0; j < arr.length; ++j) {
            if (arr[j] != 0) {
                arr[i++] = arr[j];
            }
        }
        while (i < arr.length)
            arr[i++] = 0;
        for (int j : arr)
            System.out.println(j);

    }
}
