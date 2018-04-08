package pinduoduo;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] arr = new int[n][2];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; ++i) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
            for (int j = arr[i][0]; j <= arr[i][1]; ++j) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }
        boolean findMin = false;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= k) {
                findMin = true;
                System.out.print(entry.getKey() + " ");
                break;
            }
        }
        if (!findMin) {
            System.out.println("error");
            return;
        }
        int max = -100;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= k) {
                max = entry.getKey();
            }
        }
        System.out.println(max);
    }
}
