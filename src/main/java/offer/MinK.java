package offer;

import java.util.ArrayList;

/**
 * Created on 2018-04-01
 *
 * @author Jerry Shen
 */
public class MinK {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (k > input.length)
            return res;
        int index = partition(input, 0, input.length-1);
        while(index != k -1) {
            if(index > k -1) {
                index = partition(input, 0, index - 1);
            } else {
                index = partition(input, index + 1, input.length - 1);
            }
        }
        for(int i = 0; i < k; ++i) {
            res.add(input[i]);
        }
        return res;
    }

    private int partition(int[] input, int low, int high) {
        int pivot = input[low];
        while(low < high) {
            while(low < high && input[high] >= pivot) {
                --high;
            }
            input[low] = input[high];
            while(low < high && input[low] <= pivot) {
                ++low;
            }
            input[high] = input[low];
        }
        input[low] = pivot;
        return low;
    }
}
