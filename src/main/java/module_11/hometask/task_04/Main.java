package module_11.hometask.task_04;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = 1L << 48;
        long seed = 1L;

        anInfiniteStream(a, c, m, seed)
//                .limit(10)
                .forEach(num -> System.out.println(num));

//        anInfiniteStream(a, c, m, seed)
//                .peek(x -> System.out.println("GENERATED: " + x))
//                .limit(10)
//                .peek(x -> System.out.println("AFTER limit passes: " + x))
//                .forEach(x -> System.out.println("PRINT: " + x));
    }

    public static Stream<Long> anInfiniteStream(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
