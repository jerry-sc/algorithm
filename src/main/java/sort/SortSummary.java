package sort;

import java.util.Arrays;

public class SortSummary {

    /**
     * 插入排序
     *
     * 1. 从第一个元素开始，该元素可以认为已经被排序
     * 2. 取出下一个元素，在已经排序的元素序列中从后向前扫描
     * 3. 如果该元素（已排序）大于新元素，将该元素移到下一位置
     * 4. 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     * 5. 将新元素插入到该位置后
     * 6. 重复步骤2~5
     *
     * @param arr  待排序数组
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            for (int j = i; j > 0; --j) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    /**
     * 二分查找插入排序
     *
     * 直接插入排序使用顺序从后往前查找，查找的时间复杂度为O(n)
     * 使用二分查找可减少比较次数，从而可降低查找时间复杂度
     *
     * @param arr 待排序数组
     */
    public static void binarySearchInsertSort(int[] arr) {
        for (int i=1;i<arr.length;++i) {
            int pos = binarySearch(arr, arr[i], i-1);
            int j = i;
            int temp = arr[i];
            while (j > pos) {
                arr[j] = arr[j-1];
                --j;
            }
            arr[pos] = temp;

            System.out.println(Arrays.toString(arr));
        }
    }

    private static int binarySearch(int[] arr, int k, int high) {
        int low = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k)
                return mid+1;
            else if (arr[mid] > k)
                high = mid-1;
            else
                low = mid + 1;
        }
        return low;
    }

    /**
     * 希尔排
     *
     * 1. 选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；（注意此算法的gap取值，一般初次取数组半长，之后每次再减半，直到增量为1）
     * 2. 按增量序列个数k，对序列进行k 趟排序；
     * 3. 每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。
     *    仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
     * @param arr  待排序数组
     */
    public static void shellSort(int[] arr) {
        int gap = arr.length / 2;   // 初试gap取数组长度一半
        for (;gap > 0; gap /=2) {   // 不断缩小gap，直到1为止
            for (int i = 0; i+gap < arr.length; ++i){
                for (int j = i + gap; j-gap >= 0; j-=gap) {
                    if (arr[j] < arr[j-gap]) {
                        int temp = arr[j];
                        arr[j] = arr[j-gap];
                        arr[j-gap] = temp;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    /**
     * 选择排序
     *
     * 1. 从待排序序列中，找到关键字最小的元素；
     * 2. 如果最小元素不是待排序序列的第一个元素，将其和第一个元素互换；
     * 3. 从余下的 N - 1 个元素中，找出关键字最小的元素，重复①、②步，直到排序结束。
     *    仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
     * @param arr  待排序数组
     */
    public static void selectionSort(int[] arr) {
        for (int i=0; i < arr.length; ++i) {
            int min = i;
            for (int j = i+1; j < arr.length;++j) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            System.out.println(Arrays.toString(arr));
        }
    }

    /**
     * 堆排序
     *
     * 1. 先将初始序列K[1..n]建成一个大顶堆, 那么此时第一个元素K1最大, 此堆为初始的无序区.
     * 2. 再将关键字最大的记录K1 (即堆顶, 第一个元素)和无序区的最后一个记录 Kn 交换, 由此得到新的无序区K[1..n−1]和有序区K[n], 且满足K[1..n−1].keys⩽K[n].key
     * 3. 交换K1 和 Kn 后, 堆顶可能违反堆性质, 因此需将K[1..n−1]调整为堆. 然后重复步骤②, 直到无序区只有一个元素时停止.
     * @param arr  待排序数组
     */
    public static void heapSort(int[] arr) {
        buildMaxHeap(arr);
        for (int i=arr.length-1;i>0;--i) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            adjustDownToUp(arr, 0, i);
        }
    }

    //构建大根堆：将arr看成完全二叉树的顺序存储结构
    private static void buildMaxHeap(int[] arr){
        //从最后一个节点array.length-1的父节点（array.length-1-1）/2开始，直到根节点0，反复调整堆
        for (int i=arr.length-2;i>=0;--i) {
            adjustDownToUp(arr, i,arr.length);
        }
    }

    //将元素array[k]自下往上逐步调整树形结构
    private static void adjustDownToUp(int[] arr, int k, int length){
        int temp = arr[k];
        for (int i=2*k+1;i<length;i=i*2+1) { // i初始化为节点k的左孩子，沿较大子节点向下调整
            if (i+1 < length && arr[i] < arr[i+1]) { // 确保有右结点
                ++i; //如果节点的右孩子>左孩子，则取右孩子节点的下标
            }
            if (temp >= arr[i]) { //根节点 >=左右子女中关键字较大者，调整结束
                break;
            } else {
                arr[k] = arr[i]; //将左右子结点中较大值array[i]调整到双亲节点上
                k = i; //【关键】修改k值，以便继续向下调整
            }
        }
        arr[k] = temp; // 找到合适位置
    }

    /**
     * 冒泡排序
     *
     * ①. 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * ②. 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
     * ③. 针对所有的元素重复以上的步骤，除了最后一个。
     * ④. 持续每次对越来越少的元素重复上面的步骤①~③，直到没有任何一对数字需要比较。
     * @param arr  待排序数组
     */
    public static void bubbleSort(int[] arr){
        for (int i=1;i<arr.length;++i) {
            boolean flag = false;
            for (int j=1;j<=arr.length-i;++j) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;
                }
            }
            System.out.println(Arrays.toString(arr));
            if (!flag)  // 只有交换了才进行下一轮
                break;
        }
    }

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
            int index = partition(arr, low, high);  // 找到此趟确定位置
            quickSort(arr, low, index-1);   // 分别对左右两边进行快速排序
            quickSort(arr, index+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {    // 划分左右两边
        int key = arr[low]; // 选取基准值
        while (low < high) {
            while (low < high && arr[high] >= key){ // 从后往前找到第一个比基准值小的位置
                --high;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= key) {
                ++low;
            }
            arr[high] = arr[low];
        }
        arr[low] = key;
        System.out.println(Arrays.toString(arr));
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

    public static void mergingSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergingSort(arr, left, mid);        // 拆分
        mergingSort(arr, mid+1, right);

        merge(arr, left, mid, right);   // 合并
        System.out.println(Arrays.toString(arr));
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] tmpArr = new int[right-left+1]; // 临时数组
        int i = mid + 1; // 右数组第一个元素下标
        int j = 0;
        int k = left;
        while (left <= mid && i <= right) {
            if (arr[left] <= arr[i]) {
                tmpArr[j++] = arr[left++];
            } else {
                tmpArr[j++] = arr[i++];
            }
        }
        while (left <= mid) {
            tmpArr[j++] = arr[left++];
        }
        while (i <= right) {
            tmpArr[j++] = arr[i++];

        }
        int l=0;
        while (l < tmpArr.length) {
            arr[k + l] = tmpArr[l++];
        }
    }

}
