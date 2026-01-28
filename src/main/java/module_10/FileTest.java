package core.com.module_10;

import java.io.File;
import java.util.Arrays;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("C:\\");
        File[] filesInCDrive = file.listFiles();
        System.out.println("filesInCDrive = " + Arrays.toString(filesInCDrive));


        File file2 = new File("C:\\Java\\jdk-8u461-windows-x64.exe");
        File parentFolder = file2.getParentFile();
        System.out.println("parentFolder = " + parentFolder);

//        File file1 = new File("C:\\dir1\\dir2\\dir3");
//        file1.mkdirs();

        File file3 = new File("C:\\dir");
        if (!file3.exists()) {
            file3.mkdir();
        }
    }
}
