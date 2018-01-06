package round1;

public class P26 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int pre = 0;
        for (int i = pre; i < nums.length; ++i) {
            if (nums[i] == nums[pre]) {
                continue;
            }
            nums[++pre] = nums[i];
        }
        return pre+1;
    }

    public static void main(String[] args) {
        int[] a = {1,2};
        P26 p26 = new P26();
        System.out.println(p26.removeDuplicates(a));
    }
}
