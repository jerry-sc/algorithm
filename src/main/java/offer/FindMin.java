package offer;

/**
 * Created on 2018-04-01
 *
 * @author Jerry Shen
 */
public class FindMin {

    /**
     * 查找旋转数组的最小值
     * @param array
     * @return
     */
    public int minNumberInRotateArray(int [] array) {
        int low = 0, high = array.length - 1;
        int mid = 0;
        while(array[low] >= array[high]) {
            if (high - low == 1) {
                mid = high;
                break;
            }
            mid = (low + high) / 2;
            if (array[mid] == array[low] && array[mid] == array[high]) {
                return seqSearch(array, low, high);
            }
            if (array[mid] >= array[low])    low = mid;
            else if (array[mid] <= array[high]) high = mid;
        }
        return array[mid];
    }

    private int seqSearch(int[] array, int low, int high) {
        int res = array[low];
        for (int i = low + 1; i <= high; ++i) {
            if (array[i] < res) {
                return array[i];
            }
        }
        return res;
    }
}
