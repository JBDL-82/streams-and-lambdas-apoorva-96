import java.util.Comparator;
import java.util.Optional;

public class EmployeeWithMaxSalary_Q4 {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Optional<Employee> result = Employee.getAllEmployees().stream()
                .max(Comparator.comparing(Employee::getSalary));
        result.ifPresent(System.out::println);
    }
}
