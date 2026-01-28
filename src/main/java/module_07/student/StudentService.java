package core.com.module_07.student;

import java.io.FileWriter;
import java.io.IOException;

public class StudentService {
    public void saveStudentToFile(Student s) {
        try {
            FileWriter fw = new FileWriter("student-" + s.getName() + ".txt");
            fw.write(s.toString());
            fw.flush();

            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveStudentToFiles(Student[] students) {
        for (Student s : students) {
            saveStudentToFile(s);
        }
    }
}
