package case_study.services.i_ser;

import case_study.models.person.Employee;

import java.util.List;

public interface IEmployeeService {
    void save(Employee employee);

    List<Employee> getAll();
}
