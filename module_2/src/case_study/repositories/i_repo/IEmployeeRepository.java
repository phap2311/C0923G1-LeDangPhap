package case_study.repositories.i_repo;

import case_study.models.person.Employee;
import case_study.services.i_ser.IEmployeeService;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee>{



    List<Employee> getAll();

    Employee checkByCode(String code);

    void editFullName(String fullName, Employee employee);
    void editBirthday(String birthday, Employee employee);

    void editGender(String gender, Employee employee);

    void editIDCard(IEmployeeService iEmployeeService, Employee employee);

    void editNumberPhone(String numberPhone, Employee employee);

    void editEmail(String email, Employee employee);

}
