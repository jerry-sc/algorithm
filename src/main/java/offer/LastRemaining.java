package offer;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created on 2018-03-23
 *
 * @author Jerry Shen
 */
public class LastRemaining {
    public int LastRemaining_Solution(int n, int m) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < n; ++i) {
            list.add(i);
        }
        int count = 0;
        Iterator<Integer> it = list.iterator();
        while(count < n - 1) {
            for (int i = 0; i < m; ++i) {
                if (!it.hasNext()) {
                    it = list.iterator();
                }
                it.next();
            }
            it.remove();
            ++count;
        }
        return list.poll();
    }
}
