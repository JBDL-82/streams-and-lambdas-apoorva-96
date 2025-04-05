import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryByDepartment_Q8 {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Map<String, Double> result = Employee.getAllEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(result);
    }
}
