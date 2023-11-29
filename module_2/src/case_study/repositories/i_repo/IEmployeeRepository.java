package case_study.repositories.i_repo;

import case_study.models.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    void save(Employee employee);

    List<Employee> getAll();
}
