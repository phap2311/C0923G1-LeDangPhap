package ss8_mvc.repository;

import ss8_mvc.model.Student;

public class StudentRepositorylmpl implements StudentRepository {
    private static Student[] studentlist;
    private static int size = 0;

    static {
        studentlist = new Student[10];
        studentlist[0] = new Student(1, "Nguyen Van A", 9.2);
        studentlist[1] = new Student(2, "Nguyen Van B", 8.6);
        studentlist[2] = new Student(3, "Nguyen Van C", 7.1);
        size = 3;
    }

    @Override
    public Student[] findAll() {
        Student[] students = new Student[size];
        for (int i = 0; i < size; i++) {
            students[i] = studentlist[i];
        }
        return students;
    }

    @Override
    public void save(Student student) {
        studentlist[size] = student;
        size++;
    }
}
