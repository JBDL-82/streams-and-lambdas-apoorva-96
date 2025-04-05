import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeNameInitialMap_Q12 {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        List<String> list = List.of("Alice", "Andrew", "Bob");
        Map<Character, List<String>> result = list.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(result);
    }
}
