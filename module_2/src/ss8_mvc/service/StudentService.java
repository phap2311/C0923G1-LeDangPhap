package ss8_mvc.service;

import ss8_mvc.model.Student;

public interface StudentService {
    Student[] findAll();
    void save (Student student);
}
