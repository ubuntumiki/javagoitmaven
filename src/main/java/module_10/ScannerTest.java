package core.com.module_10;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        String numbers = "10 20 30";
        System.out.println("numbers = " + numbers);
        Scanner scanner = new Scanner(numbers);

        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt() + " ");
        }
    }
}
