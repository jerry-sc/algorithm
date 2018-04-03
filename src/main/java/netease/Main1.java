package netease;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String str = scanner.next();
        int res = 0;
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (c == 'L')
                --res;
            else
                ++res;
        }
        res %= 4;
        if (res == 0) System.out.println("N");
        if (res < 0) {
            if (res == -1) System.out.println("W");
            else if (res == -2) System.out.println("S");
            else if (res == -3) System.out.println("E");
        } else {
            if (res == 1) System.out.println("E");
            else if (res == 2) System.out.println("S");
            else if (res == 3) System.out.println("W");
        }
    }
}
