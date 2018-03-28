package netease;


import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long count = 0;
        if (k == 0) {
            System.out.println(n * n);
            return;
        }
        for (int y = k + 1; y <= n; ++y) {
            count += (n / y) * (y - k);
            if (n % y >=k) count += n % y - k + 1;
        }
        System.out.println(count);
    }
}
