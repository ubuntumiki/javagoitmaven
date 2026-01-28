package module_11.hometask.task_05;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Zip {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();

        Iterator<T> zipIterator = new Iterator<>() {
            private boolean takeFromList = true;

            @Override
            public boolean hasNext() {
                return iterator1.hasNext() && iterator2.hasNext();
            }

            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();

                T value;
                if (takeFromList) {
                    value = iterator1.next();
                } else {
                    value = iterator2.next();
                }
                takeFromList = !takeFromList;
                return value;
            }
        };

        Spliterator<T> spliterator = Spliterators.spliteratorUnknownSize(zipIterator, Spliterator.ORDERED);

        return StreamSupport.stream(spliterator, false)
                .onClose(() -> first.close())
                .onClose(() -> second.close());
    }

    public static void main(String[] args) {
        Stream<Integer> a = Stream.of(1, 2, 3, 4);
        Stream<Integer> b = Stream.of(10, 20, 30);

        System.out.println(zip(a, b).toList());
    }
}
