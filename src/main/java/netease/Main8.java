package netease;

import java.util.*;

/**
 * 牛牛的作业薄上有一个长度为 n 的排列 A，这个排列包含了从1到n的n个数，但是因为一些原因，其中有一些位置（不超过 10 个）看不清了，
 * 但是牛牛记得这个数列顺序对的数量是 k，顺序对是指满足 i < j 且 A[i] < A[j] 的对数，请帮助牛牛计算出，符合这个要求的合法排列的数目
 */
public class Main8 {

    private static int res = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        List<Integer> missPos = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
            if (arr[i] == 0) missPos.add(i);
            set.add(arr[i]);
        }
        int index = 0;
        for (int i = 1; i <= n; ++i) {
            if (!set.contains(i)) {
                arr[missPos.get(index++)] = i;
            }
        }
        dfs(missPos, arr, 0, k);
        System.out.println(res);
    }

    private static void dfs(List<Integer> missPos, int[] arr, int index, int k) {
        if (index == missPos.size()) {
            if (count(arr) == k) ++res;
            return;
        }
        for (int i = index; i < missPos.size(); ++i) {
            swap(arr, missPos.get(index), missPos.get(i));
            dfs(missPos, arr, index + 1,k);
            swap(arr, missPos.get(i), missPos.get(index));
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static int count(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i+1; j < arr.length; ++j) {
                if (arr[i] < arr[j]) ++count;
            }
        }
        return count;
    }
}
