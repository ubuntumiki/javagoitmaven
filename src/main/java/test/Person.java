package test;

public class Person {
    public static void main(String[] args) {
        printNumbers(5, 8);
    }

    public static void printNumbers(int start, int end) {
        int current = start;

        while(true) {
            System.out.println(current);
            current++;
            if (current > end) {
                return;
            }
        }
    }
}