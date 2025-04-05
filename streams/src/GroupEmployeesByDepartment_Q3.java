import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByDepartment_Q3 {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Map<String, List<Employee>> result = Employee.getAllEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(result);
    }
}
