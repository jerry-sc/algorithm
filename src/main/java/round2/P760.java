package round2;

import java.util.*;

public class P760 {

    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < B.length; ++i) {
            List<Integer> list;
            if ((list = map.get(B[i])) == null) {
                list = new LinkedList<>();
                map.put(B[i], list);
            }
            list.add(i);
        }
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; ++i) {
            List<Integer> list = map.get(A[i]);
            res[i] = list.remove(0);
        }
        return res;
    }
}
