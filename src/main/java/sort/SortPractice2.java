package sort;

import java.util.Arrays;

/**
 * Created on 2018-03-07
 *
 * @author Jerry Shen
 */
public class SortPractice2 {

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
            quickSort(arr, partition +1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while (low < high) {
            while (low < high && pivot <= arr[high]) {
                --high;
            }
            arr[low] = arr[high];
            while (low < high && pivot >= arr[low]) {
                ++low;
            }
            arr[high] = arr[low];
        }
        arr[low] =  pivot;
        return low;
    }

    /**
     * 归并排序（递归）
     *
     * ①. 将序列每相邻两个数字进行归并操作，形成 floor(n/2)个序列，排序后每个序列包含两个元素；
     * ②. 将上述序列再次归并，形成 floor(n/4)个序列，每个序列包含四个元素；
     * ③. 重复步骤②，直到所有元素排序完毕。
     * @param arr	 待排序数组
     */
    public static void mergingSort(int[] arr){
        mergingSort(arr, 0, arr.length-1);
    }

    private static void mergingSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mergingSort(arr, low, mid);
        mergingSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
        System.out.println(Arrays.toString(arr));
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] tmp = new int[high - low + 1];
        int mark = low;
        int j = mid + 1;
        int i = 0;
        while (low <= mid && j <= high) {
            if (arr[low] <= arr[j]) {
                tmp[i++] = arr[low++];
            } else {
                tmp[i++] = arr[j++];
            }
        }
        while (low <= mid) {
            tmp[i++] = arr[low++];
        }
        while (j <= high) {
            tmp[i++] = arr[j++];
        }
        int l = 0;
        while (l < tmp.length) {
            arr[mark++] = tmp[l++];
        }
    }
}
