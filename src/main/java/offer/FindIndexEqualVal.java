package offer;

/**
 * Created on 2018-04-04
 *
 * @author Jerry Shen
 */
public class FindIndexEqualVal {

    public int findIndexEqualVal(int[] arr) {
        int low = 0, high = arr.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid == arr[mid]) return mid;
            if (mid > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
