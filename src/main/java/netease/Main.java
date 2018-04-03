package netease;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        for (int x = 1; x <= n; ++x) {
            for (int y = 1; y <= n; ++y) {
                if (x % y >= k) {

                }
            }
        }
        System.out.println(count);
    }
}
