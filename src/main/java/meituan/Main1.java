package meituan;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int res = 0;
        for (int j = 0; j + t.length() <= s.length();++j) {
            res += diff(s.substring(j, j + t.length()),t);
        }
        System.out.println(res);
    }

    private static int diff(String a, String b) {
        int val = 0;
        for (int i = 0; i < a.length();++i) {
            if (a.charAt(i) != b.charAt(i)) ++val;
        }
        return val;
    }
}
