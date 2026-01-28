package module_11.hometask.task_01;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Vasya", "Ivan", "Olya", "Petro", "Masha", "Lyolya");

        System.out.println(notPairIndex(names));
    }

    public static String notPairIndex(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(index -> index % 2 == 1)
                .mapToObj(index -> index + ". " + names.get(index))
                .collect(Collectors.joining(", "));
    }
}
