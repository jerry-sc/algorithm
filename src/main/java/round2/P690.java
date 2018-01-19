package round2;

import java.util.*;

public class P690 {

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        Map<Integer, Boolean> visited = new HashMap<>();
        int sum = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(id);
        while (!queue.isEmpty()) {
            Integer i = queue.poll();
            if (!visited.getOrDefault(i, false)) {
                visited.put(i, true);
                sum += map.get(i).importance;
                queue.addAll(map.get(i).subordinates);
            }
        }
        return sum;
    }
}
