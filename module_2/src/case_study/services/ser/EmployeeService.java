package case_study.services.ser;

import case_study.models.person.Employee;
import case_study.repositories.i_repo.IEmployeeRepository;
import case_study.repositories.repo.EmployeeRepository;
import case_study.services.i_ser.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository iEmployeeRepository= new EmployeeRepository();
    @Override
    public void save(Employee employee) {
       iEmployeeRepository.save(employee);
    }

    @Override
    public void editBirthday(String birthday, Employee employee) {
        iEmployeeRepository.editBirthday(birthday, employee);
    }

    @Override
    public void editGender(String gender, Employee employee) {
        iEmployeeRepository.editGender(gender,employee);
    }

    @Override
    public void editIDCard(IEmployeeService iEmployeeService, Employee employee) {
        iEmployeeRepository.editIDCard(iEmployeeService,employee);
    }

    @Override
    public void editNumberPhone(String numberPhone, Employee employee) {
        iEmployeeRepository.editNumberPhone(numberPhone,employee);
    }

    @Override
    public void editEmail(String email, Employee employee) {
        iEmployeeRepository.editEmail(email,employee);
    }


    @Override
    public List<Employee> getAll() {
       return iEmployeeRepository.getAll();
    }

    @Override
    public Employee checkByCode(String code) {
       return iEmployeeRepository.checkByCode(code);

    }

    @Override
    public void editFullName(String fullName, Employee employee) {
        iEmployeeRepository.editFullName(fullName,employee);
    }


}
