package case_study.repositories.i_repo;

import case_study.models.person.Employee;
import case_study.services.i_ser.IEmployeeService;

public interface IRepository<E> {

    void save(Employee employee);
}
