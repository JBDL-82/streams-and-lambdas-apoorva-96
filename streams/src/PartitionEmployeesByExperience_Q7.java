import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEmployeesByExperience_Q7 {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Map<String, List<Employee>> result = Employee.getAllEmployees().stream()
                .collect(Collectors.groupingBy(employee -> employee.getExperience() >= 5 ? "Experience >= 5 years" : "Experience < 5 years"));
        System.out.println(result);
    }
}
