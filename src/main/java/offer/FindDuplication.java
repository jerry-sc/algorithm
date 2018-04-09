package offer;

/**
 * Created on 2018-04-01
 *
 * @author Jerry Shen
 */
public class FindDuplication {

    /**
     * 不修改数组找出重复的数字。
     * 在一个长度为n+1的数组里的所有数字都在1~n的范围内，所以数组中至少有一个数字是重复的，请找出任意一个重复的数字
     * @param array array
     */
    public int getDuplication(int[] array) {
        int low = 1, high = array.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            int count = countRange(array, low, mid);
            if (count > mid - low + 1) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private int countRange(int[] array, int low, int high) {
        int count = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] >= low && array[i] <= high) {
                ++count;
            }
        }
        return count;
    }

    public int getDuplication2(int[] array) {
        int slow = 0;
        int fast = 0;
        do {
            slow = array[slow];
            fast = array[array[fast]];
        } while (slow != fast);
        fast = 0;
        while (fast != slow) {
            fast = array[fast];
            slow = array[slow];
        }
        return fast;
    }
}
