package ss8_mvc.repository;

import ss8_mvc.model.Student;

public interface StudentRepository {
    Student[] findAll();
    void save (Student student);
}
