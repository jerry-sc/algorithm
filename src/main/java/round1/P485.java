package round1;

import java.net.UnknownHostException;

/**
 * Created on 2017-09-07
 *
 * @author Jerry Shen
 */
public class P485 {

    public static void main(String[] args) throws UnknownHostException {
        int[] nums = {1,0,1,1,0,1};
        int max = 0;
        int temp = 0;
        for(int i =0; i < nums.length;++i) {
            if(nums[0] == 1)
                ++temp;
            else {
                max = Math.max(max, temp);
                temp = 0;
            }
        }
        System.out.println(max);
    }
}
