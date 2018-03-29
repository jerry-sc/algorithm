package netease;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; ++i)
            v[i] = scanner.nextInt();
        System.out.println(put(v, 0, w));
    }

    private static int put(int[] v, int index, int left) {
        int count = 0;
        if (index == v.length ) {
            count = left >= 0 ? 1 : 0;
        } else {
            count += put(v, index + 1, left);
            count += put(v, index + 1, left - v[index]);
        }
        return count;
    }
}
