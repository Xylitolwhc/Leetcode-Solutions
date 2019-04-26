import java.util.Hashtable;
import java.util.List;

/**
 * Created by Hanson on 2019/4/26
 *
 * @author Hanson
 * 2019/4/26
 * 690. Employee Importance
 * https://leetcode.com/problems/employee-importance/
 */
public class Solution_690 {
    private static Hashtable<Integer, Employee> employeesTable = new Hashtable<>();

    public int getImportance(List<Employee> employees, int id) {
        for (Employee employee : employees) {
            employeesTable.put(employee.id, employee);
        }

        return getImportance(id);
    }

    private int getImportance(int id) {
        Employee employee = employeesTable.get(id);
        if (employee.subordinates.size() == 0) {
            return employee.importance;
        } else {
            int sum = employee.importance;
            for (Integer subId : employee.subordinates) {
                sum += getImportance(subId);
            }
            return sum;
        }
    }
}

