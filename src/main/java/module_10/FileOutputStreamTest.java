package core.com.module_10;

import java.io.*;
import java.util.Arrays;

public class FileOutputStreamTest {
    public static void main(String[] args) {
//        writeFileWithOutputStream();
//        writeFile();
        readFileWithInputStream();
    }

    public static void writeFileWithOutputStream() {
        String text = "Hello from Output Stream";
        try(FileOutputStream fileOutputStream = new FileOutputStream("C:\\Java\\project\\javagoit\\src\\core\\com\\module_10\\test.txt")) {
            byte[] buffer = text.getBytes();
            fileOutputStream.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeFile() {
        File file = new File("C:\\Java\\project\\javagoit\\src\\core\\com\\module_10\\test2.txt");
        //try-with-resources
        try (FileWriter writer = new FileWriter(file))
        {
            String text = "Hello, World!";
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFileWithInputStream() {
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Java\\project\\javagoit\\src\\core\\com\\module_10\\test.txt")) {
            System.out.println("File size is bytes: " + fileInputStream.available());
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            for (int i = 0; i < buffer.length; i++) {
                System.out.print((char) buffer[i]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFile() {
        try (FileReader reader = new FileReader("C:\\Java\\project\\javagoit\\src\\core\\com\\module_10\\test.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFileWithBuffer() {
        try (FileReader reader = new FileReader("C:\\Java\\project\\javagoit\\src\\core\\com\\module_10\\test.txt")) {
            char[] buf = new char[256];
            int c;
            while ((c = reader.read(buf)) > 0) {
                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.println(Arrays.toString(buf));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
