package case_study.repositories.repo;

import case_study.models.person.Employee;
import case_study.repositories.i_repo.IEmployeeRepository;
import case_study.util.FileEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    List<Employee> employeeList = new ArrayList<>();

    @Override
    public void save(Employee employee) {
        employeeList.add(employee);
        FileEmployee.readCSV();
        FileEmployee.writeCSV(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeList;
    }
}
