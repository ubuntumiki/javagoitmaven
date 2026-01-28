package module_11.srteam;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        Stream<String> names =
                Arrays.asList("John", "Bill", "Max", "Alex")
                        .stream()
                        .filter(name -> name.length() > 3)
                        .map(name -> "Mr/Ms " + name)
                        .sorted()
                        .limit(2);

        System.out.println(names.count());

        int minValue =
                Arrays
                        .asList(3, 10, 4, 1, 17, 8)
                        .stream()
                        .min((a, b) -> a - b)
                        .get();
        System.out.println(minValue);
    }
}
