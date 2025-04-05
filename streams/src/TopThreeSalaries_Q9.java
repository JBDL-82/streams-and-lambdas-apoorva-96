import java.util.Comparator;
import java.util.List;

public class TopThreeSalaries_Q9 {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        List<String> result = Employee.getAllEmployees()
                .stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .map(Employee::getName)
                .toList();
        System.out.println(result);
    }
}
