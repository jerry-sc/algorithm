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
            quickSort(arr, partition + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= pivot) {
                --high;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivot) {
                ++low;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivot;
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
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergingSort(arr, low, mid);
            mergingSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] tmp = new int[high - low + 1];
        int i = low, j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) tmp[k++] = arr[i++];
            else tmp[k++] = arr[j++];
        }
        while (i <= mid)
            tmp[k++] = arr[i++];
        while (j <= high)
            tmp[k++] = arr[j++];
        k = 0;
        while (k < tmp.length) {
            arr[low++] = tmp[k++];
        }
    }

    /**
     * 从数组中找出第K大的数字
     * @param arr arr
     * @param low low
     * @param high high
     * @param k K
     * @return position
     */
    public static int findKMax(int[] arr, int low, int high, int k) {
        int ind = partition(arr, low, high);
        while (k != ind) {
            if (ind < k) {
                ind = partition(arr, ind + 1, high);
            } else {
                ind = partition(arr, low, ind-1);
            }
        }
        return arr[k];
    }

}
