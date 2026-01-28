package module_11.srteam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApiMain {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(0, 100);

        IntStream s = intStream
                .filter(n -> n % 2 == 0)
                .limit(10)
                .skip(5)
                .map(n -> n * 10);

//        List<Integer> list = s.boxed().toList();
        List<Integer> list2 = s.boxed().collect(Collectors.toList());


//        System.out.println(list);
        System.out.println(list2);
    }
}
