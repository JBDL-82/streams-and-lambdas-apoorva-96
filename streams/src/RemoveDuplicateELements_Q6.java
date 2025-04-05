import java.util.List;

public class RemoveDuplicateELements_Q6 {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        List<Integer> list = List.of(1, 5, 3, 6, 5, 2, 7, 9, 8, 5, 5);
        List<Integer> result = list.stream()
                .distinct()
                .toList();
        System.out.println(result);
    }
}
