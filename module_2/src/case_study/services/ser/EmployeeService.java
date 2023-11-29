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
    public List<Employee> getAll() {
       return iEmployeeRepository.getAll();
    }
}
