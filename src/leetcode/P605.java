package leetcode;

public class P605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int hasPlanted = 0;
        boolean prev = true;
        boolean next;
        for (int i=0; i<flowerbed.length; ++i) {
            if (i == flowerbed.length-1 || flowerbed[i+1] == 0)
                next = true;
            else
                next = false;
            if (prev && next && flowerbed[i] == 0) {
                ++hasPlanted;
                flowerbed[i] = 1;
            }
            if (flowerbed[i] == 1)
                prev = false;
            else
                prev = true;
        }
        return n <= hasPlanted;
    }

    public static void main(String[] args) {
        P605 p605 = new P605();
        int[] nums = {1,0,0,0,1};
        int n = 2;
        System.out.println(p605.canPlaceFlowers(nums, n));
    }
}
