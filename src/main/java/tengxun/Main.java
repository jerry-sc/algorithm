package tengxun;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; ++i) {
            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int x3 = scanner.nextInt();
            int x4 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int y3 = scanner.nextInt();
            int y4 = scanner.nextInt();
            if (test(helper(x1, y1, x2, y2), helper(x3, y3, x4, y4)) ||
                    test(helper(x1, y1, x3, y3), helper(x2, y2, x4, y4))  ||
                    test(helper(x1, y1, x4, y4), helper(x2, y2, x3, y3))
                    ) {
                System.out.println("Yes");
            } else
                System.out.println("No");
        }
    }

    private static boolean test(int[] helper1, int[] helper2) {
        return helper1[0] * helper2[0] + helper1[1] * helper2[1] == 0;
    }

    private static int[] helper(int x1, int y1, int x2, int y2) {
        int[] vec = new int[2];
        vec[0] = x2 - x1;
        vec[1] = y2 - y1;
        return vec;
    }
}
