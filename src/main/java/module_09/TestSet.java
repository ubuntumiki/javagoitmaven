package core.com.module_09;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {
        String[] allNames = {"John", "Elon", "John", "Bill", "Bill"};

        Set<String> uniqueNames = new HashSet<>();
        for(String name: allNames) {
            uniqueNames.add(name);
        }

        for(String name: uniqueNames) {
            System.out.println(name); //John, Elon, Bill
        }

        Set<Integer> prices = new HashSet<>();
        prices.add(99);
        System.out.println(prices.contains(99)); //true;
        System.out.println(prices.contains(0) + "\n"); //false

        Deque<String> names = new ArrayDeque<>();
        names.add("John");
        names.add("Bill");
        System.out.println(names.poll());
        System.out.println(names.poll() + "\n");

        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("Java", 100_500);
        System.out.println(salaries.get("Java"));
    }
}
