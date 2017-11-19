package leetcode;


import java.util.*;

// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};


public class P690 {

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        int count = 0;
        Queue<Employee> queue = new LinkedList<>();
        queue.add(map.get(id));
        while (queue.size() != 0) {
            Employee employee = queue.poll();
            count += employee.importance;
            for (int i=0;i<employee.subordinates.size();++i) {
                queue.add(map.get(employee.subordinates.get(i)));
            }
        }
        return count;
    }
}
