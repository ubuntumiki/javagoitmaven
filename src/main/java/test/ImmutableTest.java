package test;

import java.util.Arrays;

public class ImmutableTest {
    public static void main(String[] args) {
        String numbers = "";
        for(int i = 1; i < 10; i++) {
            numbers += i;
            System.out.println(numbers);
        }

//        String str = new String(null);
//        System.out.println(str);

        byte[] bytes = {74, 97, 118, 97};
        System.out.println(new String(bytes));

        System.out.println(Arrays.toString("Java".getBytes()));

        System.out.println(Arrays.toString("Java".toCharArray()));

//        String result = "";
//        for(int i = 0; i < 100000; i++) {
//            result += i;
//        }
//
//        System.out.println(result);

        StringBuilder result = new StringBuilder();
        for(int i = 0; i <= 100000; i++) {
            result.append(i);
        }

        System.out.println(result);

    }
}
