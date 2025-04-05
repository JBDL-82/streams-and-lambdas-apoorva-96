import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentWithNoOfEmployees_Q11 {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Map<String, Long> result = Employee.getAllEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting()));
        System.out.println(result);
    }
}
