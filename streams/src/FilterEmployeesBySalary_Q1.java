import java.util.List;

public class FilterEmployeesBySalary_Q1 {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        List<Employee> result = Employee.getAllEmployees()
                .stream()
                .filter(employee -> employee.getSalary() >= 50000)
                .toList();
        System.out.println(result);
    }
}
