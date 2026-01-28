package module_11.srteam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String > names = Arrays.asList("John", "Bill");

        Stream<String> nameStream = names.stream().filter((name) -> name.contains("J"));

        nameStream.forEach(System.out::println);
        System.out.println("------------------------");

        Stream<Integer> even = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .stream()
                .filter(number -> number % 2 == 0);
        even.forEach(System.out::println);
        System.out.println("------------------------");

        Stream<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .stream()
                .map(number -> number * 2);
        numbers.forEach(System.out::println);
        System.out.println("------------------------");

        Stream<Integer> num = Arrays.asList(2, 3, 5, 7, 4, 3, 2, 7)
                .stream()
                .distinct();
        num.forEach(System.out::println);
        System.out.println("------------------------");

        Stream<Integer> num2 =
                Arrays.asList(1, 3, 2, 4, 5)
                        .stream()
                        .sorted();
        num2.forEach(System.out::println);
        System.out.println("------------------------");

        Stream<Integer> num3 =
                Arrays.asList(1, 3, 2, 4, 5)
                        .stream()
                        .limit(2);
        num3.forEach(System.out::println);
        System.out.println("------------------------");

        Stream<Integer> num4 =
                Arrays.asList(1, 3, 2, 4, 5)
                        .stream()
                        .skip(3);
        num4.forEach(System.out::println);
        System.out.println("------------------------");

        Stream<String> names2 =
                Arrays.asList("John", "Bill", "Max", "Alex", "Ali")
                        .stream()
                        .filter(name -> name.length() > 3)
                        .map(name -> "Mr/Ms " + name)
                        .sorted()
                        .limit(2);
        names2.forEach(System.out::println);

    }
}
