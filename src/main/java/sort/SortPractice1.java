package sort;

import java.util.Arrays;

public class SortPractice1 {

    /**
     * 快速排序（递归）
     *
     * ①. 从数列中挑出一个元素，称为"基准"（pivot）。
     * ②. 重新排序数列，所有比基准值小的元素摆放在基准前面，所有比基准值大的元素摆在基准后面（相同的数可以到任一边）。在这个分区结束之后，该基准就处于数列的中间位置。这个称为分区（partition）操作。
     * ③. 递归地（recursively）把小于基准值元素的子数列和大于基准值元素的子数列排序。
     */
    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }

    private static int partition(int[] arr, int i, int j) {
        int pivot = arr[i];
        while (i < j) {
            while (i < j && pivot <= arr[j]) {
                --j;
            }
            arr[i] = arr[j];
            while (i < j && pivot >= arr[i]) {
                ++i;
            }
            arr[j] = arr[i];
        }
        arr[i] = pivot;
        System.out.println(Arrays.toString(arr));
        return i;
    }
}
