package round1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P119 {

    public List<Integer> getRow(int rowIndex) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(1);
        List<Integer> secondLine = new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        map.put(0, firstLine);
        map.put(1, secondLine);
        for (int i = 2; i < rowIndex + 1; ++i) {
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < i+1; ++j) {
                if (j == 0 || j == i) {
                    line.add(1);
                } else {
                    List<Integer> pre = map.get(i - 1);
                    line.add(pre.get(j-1) + pre.get(j));
                }
            }
            map.put(i, line);
        }
        return map.get(rowIndex);
    }

    public static void main(String[] args) {
        P119 p119 = new P119();
        for (int i : p119.getRow(3)) {
            System.out.println(i);
        }
    }
}
