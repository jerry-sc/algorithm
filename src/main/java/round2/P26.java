package round2;

/**
 * Created on 2018-03-02
 *
 * @author Jerry Shen
 */
public class P26 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 1;
        int j = 1;
        while (i < nums.length) {
            if (nums[i] != nums[j-1]) {
                nums[j++] = nums[i];
            }
            ++i;
        }
        return j;
    }
}
