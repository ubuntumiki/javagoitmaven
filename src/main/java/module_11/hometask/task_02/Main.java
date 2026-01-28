package module_11.hometask.task_02;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Vasya", "Ivan", "Olya", "Petro", "Masha", "Lyolya");

        System.out.println(upperAndSortZtoA(names));
    }

    public static List<String> upperAndSortZtoA(List<String> names) {
        return names.stream()
                .map(str -> str.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

//        return names.stream()
//                .peek(x -> System.out.println("IN: " + x))
//                .map(String::toUpperCase)
//                .peek(x -> System.out.println("UP: " + x))
//                .sorted(Comparator.reverseOrder())
//                .peek(x -> System.out.println("SORTED: " + x))
//                .collect(Collectors.toList());
    }
}
