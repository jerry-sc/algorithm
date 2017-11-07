package leetcode;

public class P717 {

    public boolean isOneBitCharacter(int[] bits) {
        boolean flag = false;
        int i = 0;
        while (i < bits.length) {
            if (bits[i] == 1) {
                flag = false;
                i += 2;
            } else {
                ++i;
                flag = true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] bits = {1,1,1,0};
        P717 p717 = new P717();
        System.out.println(p717.isOneBitCharacter(bits));
    }
}
