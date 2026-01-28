package core.com.module_07.student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Miki");
        Student student2 = new Student("Lana");
        Student student3 = new Student("Lyolya");

        StudentService ss = new StudentService();
//        ss.saveStudentToFile(student);

        Student[] students = {student, student2, student3};
        ss.saveStudentToFiles(students);
    }
}
