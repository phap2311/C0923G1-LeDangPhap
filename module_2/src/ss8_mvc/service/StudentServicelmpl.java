package ss8_mvc.service;

import ss8_mvc.model.Student;
import ss8_mvc.repository.StudentRepository;
import ss8_mvc.repository.StudentRepositorylmpl;

public class StudentServicelmpl implements StudentService  {

private StudentRepository repository = new StudentRepositorylmpl();

    @Override
    public Student[] findAll() {
        return  repository.findAll();
    }

    @Override
    public void save(Student student) {
repository.save(student);
    }
}
