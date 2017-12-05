package leetcode;

public class P75 {

    public void sortColors(int[] nums) {
        int i = 0, j=0, k=0;
        for (int m : nums) {
            switch (m) {
                case 0:
                    ++i;break;
                case 1:
                    ++j;break;
                case 2:
                    ++k;break;
            }
        }
        for (int m=0;m<i;++m)
            nums[m] = 0;
        for (int m=i;m<i+j;++m)
            nums[m] = 1;
        for (int m=i+j;m<nums.length;++m)
            nums[m] = 2;
    }
}
