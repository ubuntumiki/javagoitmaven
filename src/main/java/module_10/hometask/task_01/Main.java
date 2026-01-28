package core.com.module_10.hometask.task_01;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/core/com/module_10/hometask/task_01/file.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter writer = new FileWriter(file);

        writer.write("987-123-4567\n");
        writer.write("123 456 7890\n");
        writer.write("(123) 456-7890\n");
        writer.close();

        printValidPhoneNumber(file);
    }

    public static void printValidPhoneNumber(File file) throws IOException {
        String format1 = "\\(\\d{3}\\) \\d{3}-\\d{4}";
        String format2 = "\\d{3}-\\d{3}-\\d{4}";

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.matches(format1) || line.matches(format2)) {
                    System.out.println(line);
                }
            }
        }
    }
}
