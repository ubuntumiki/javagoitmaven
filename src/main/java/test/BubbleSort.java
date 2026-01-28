package test;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {6, 9, 5, 3, 7, 5, 1, 2, 8, 90,};

        sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    public static void sort(int[] values) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < values.length - 1; i++) {
                int current = values[i];
                int next = values[i + 1];

                if (current > next) {
                    values[i + 1] = current;
                    values[i] = next;

                    isSorted = false;
                }
            }
        }
    }
}
