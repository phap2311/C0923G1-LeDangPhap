package ss5_access_modifier_static_method.student;

import ss5_access_modifier_static_method.student.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Hong");
        student.setClassess("C09");
        System.out.println(student);
    }
}
