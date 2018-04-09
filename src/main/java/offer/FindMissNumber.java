package offer;

/**
 * Created on 2018-04-04
 *
 * @author Jerry Shen
 */
public class FindMissNumber {

    public int findMissNumber(int[] arr) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == mid) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
