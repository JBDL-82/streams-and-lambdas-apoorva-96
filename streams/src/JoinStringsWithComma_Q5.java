import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsWithComma_Q5 {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        List<String> list = List.of("Java", "Python", "C++");
        String result = list.stream()
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}
