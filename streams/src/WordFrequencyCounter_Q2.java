import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter_Q2 {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        List<String> words = List.of("apple", "banana", "apple");
        Map<String, Long> result = words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(result);
    }
}
