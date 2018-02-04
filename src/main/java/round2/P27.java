package round2;

/**
 * Created on 2018-02-04
 *
 * @author Jerry Shen
 */
public class P27 {

    public int removeElement(int[] nums, int val) {
        int left = 0, right = nums.length-1;
        int count = 0;
        while (left <= right) {
            if (nums[left] == val) {
                ++count;
                while (left < right && nums[right] == val) {
                    ++count;
                    --right;
                }
                if (left < right) {
                    int tmp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = tmp;
                    --right;
                }
            }
            ++left;
        }
        return nums.length - count;
    }
}
