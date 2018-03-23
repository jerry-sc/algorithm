package offer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created on 2018-03-23
 *
 * @author Jerry Shen
 */
public class MaxInWindows {

    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        LinkedList<Integer> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < size; ++i) {
            while(!queue.isEmpty() && num[i] > num[queue.getLast()]) {
                queue.removeLast();
            }
            queue.add(i);
        }
        for(int i = size; i < num.length; ++i) {
            res.add(num[queue.getFirst()]);
            if ( (i - queue.getFirst()) >= size) {
                queue.removeFirst();
            }
            while(!queue.isEmpty() && num[i] > num[queue.getLast()]) {
                queue.removeLast();
            }
            queue.add(i);
        }
        res.add(num[queue.getFirst()]);
        return res;
    }
}
