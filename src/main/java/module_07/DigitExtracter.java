package core.com.module_07;

import java.util.Arrays;

class DigitExtracter {
    public int[] extract(String text) {
        char[] ch = text.toCharArray();
        int count = 0;

        for (char c : ch) {
            if (Character.isDigit(c)) {
                count++;
            }
        }

        int[] ex = new int[count];
        int index = 0;
        for (char c : ch) {
            if (Character.isDigit(c)) {
                ex[index] = c - '0';
                index++;
            }
        }

        return ex;
    }
}

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}
