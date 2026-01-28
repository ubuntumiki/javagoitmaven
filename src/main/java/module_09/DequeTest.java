package core.com.module_09;

import java.util.ArrayDeque;
import java.util.Deque;

class DequeTest {
    public static void main(String[] args) {
        Deque<String> names = new ArrayDeque<>();
        names.add("Anna");
        names.add("John");
        names.add("Bill");
        System.out.println("names = " + names);

        System.out.println(names.poll());
        System.out.println("names = " + names);
        System.out.println(names.poll());
        System.out.println("names = " + names);
        System.out.println(names.poll());
        System.out.println("names = " + names);
    }
}
