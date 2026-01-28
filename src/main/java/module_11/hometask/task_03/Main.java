package module_11.hometask.task_03;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] strArray = {"1, 2, 0", "4, 5"};

        System.out.println(sort(strArray));
    }

    public static String sort(String[] arr) {
        return Arrays.stream(arr)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(s1 -> Integer.parseInt(s1))
                .sorted()
                .map(obj -> String.valueOf(obj))
                .collect(Collectors.joining(", "));

//        return Arrays.stream(arr)
//                .peek(s -> System.out.println("SOURCE element: [" + s + "]"))
//
//                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
//                .peek(token -> System.out.println("AFTER split: [" + token + "]"))
//
//                .map(s1 -> Integer.parseInt(s1))
//                .peek(n -> System.out.println("AS int: " + n))
//
//                .sorted()
//                .peek(n -> System.out.println("AFTER sorted int: " + n))
//
//                .map(obj -> String.valueOf(obj))
//                .peek(s -> System.out.println("AS String: [" + s + "]"))
//
//                .collect(Collectors.joining(", "));
    }
}
