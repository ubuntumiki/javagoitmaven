package test;

import java.util.Arrays;

public class GoItTest2 {
    public static void main(String[] args) {
        String[] fruits = {
                "apple",
                "banana",
                "mango"
        };

        for (int i = 0; i < fruits.length; i++) {
            String fruit = fruits[i];

            String firstLetter = fruit.substring(0, 1);
            String remainder = fruit.substring(1);

            String fixedFruitName = firstLetter.toUpperCase() + remainder;

            fruits[i] = fixedFruitName;
        }

        System.out.println(Arrays.toString(fruits));
    }
}
