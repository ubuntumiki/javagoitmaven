package core.com.module_07;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class ArrayCleanerTests {
    public static void main(String[] args) {
        //Input data
        String[] items = {"a", "b", "a", "c", "b", "a"};

        //Expected output data - a, b, c
//        String[] result = new ArrayCleaner().removeDuplicates(items);
//
//        System.out.println(Arrays.toString(result));

        //Using Stream API
        List<String> unique = Arrays.stream(items).distinct().toList();
        String[] uniqueArray = unique.toArray(new String[0]);

        System.out.println(Arrays.toString(uniqueArray));

        //Using LinkedHashSet
        String[] uniqueItems2 = new LinkedHashSet<>(Arrays.asList(items)).toArray(new String[0]);
        System.out.println(Arrays.toString(uniqueItems2));
    }
}
