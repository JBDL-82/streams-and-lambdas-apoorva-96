import java.util.Comparator;
import java.util.List;

public class SortEmployeesBySalaryDescending_Q10 {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        List<Employee> result = Employee.getAllEmployees().stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();
        System.out.println(result);
    }
}
