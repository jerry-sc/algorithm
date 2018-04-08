package pinduoduo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; ++i) {
            num[i] = scanner.nextInt();
        }
        LinkedList<Integer> maxQueue = new LinkedList<>();
        LinkedList<Integer> minQueue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < k; ++i) {
            while(!maxQueue.isEmpty() && num[i] > num[maxQueue.getLast()]) {
                maxQueue.removeLast();
            }
            maxQueue.add(i);
        }
        for(int i = 0; i < k; ++i) {
            while(!minQueue.isEmpty() && num[i] < num[minQueue.getLast()]) {
                minQueue.removeLast();
            }
            minQueue.add(i);
        }
        for(int i = k; i < num.length; ++i) {
            res.add(num[maxQueue.getFirst()] - num[minQueue.getFirst()]);
            if ( (i - maxQueue.getFirst()) >= k) {
                maxQueue.removeFirst();
            }
            if ((i - minQueue.getFirst()) >= k) {
                minQueue.removeFirst();
            }
            while(!maxQueue.isEmpty() && num[i] > num[maxQueue.getLast()]) {
                maxQueue.removeLast();
            }
            maxQueue.add(i);
            while(!minQueue.isEmpty() && num[i] < num[minQueue.getLast()]) {
                minQueue.removeLast();
            }
            minQueue.add(i);
        }
        res.add(num[maxQueue.getFirst()] - num[minQueue.getFirst()]);
        for (int i = 0; i < res.size(); ++i) {
            if (i == 0) System.out.print(res.get(i));
            else System.out.print(" " + res.get(i));
        }
        System.out.println();
    }
}
