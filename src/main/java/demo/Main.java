package demo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        f(9999);
    }

    private static void f(int x) {
        int count = 0;
        while (x != 0) {
            ++count;
            x = x & (x-1);
        }
        System.out.println(count);
    }
}