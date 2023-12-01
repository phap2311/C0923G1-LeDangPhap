package case_study.repositories.repo;

import case_study.models.person.Employee;
import case_study.repositories.i_repo.IEmployeeRepository;
import case_study.services.i_ser.IEmployeeService;
import case_study.util.FileEmployee;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employeeList ;
    static {
        employeeList = FileEmployee.readCSV();

    }

    @Override
    public void save(Employee employee) {
        employeeList.add(employee);

        FileEmployee.writeCSV(employeeList);
    }



    @Override
    public List<Employee> getAll() {

        return employeeList;
    }

    @Override
    public Employee checkByCode(String code) {
        for (Employee employee : employeeList) {
            if (employee.getCode().equals(code)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void editFullName(String fullName, Employee employee) {

        employee.setFullName(fullName);
        FileEmployee.writeCSV(employeeList);
    }


    @Override
    public void editBirthday(String birthday, Employee employee) {
        employee.setBirthday(birthday);
        FileEmployee.writeCSV(employeeList);
    }

    @Override
    public void editGender(String gender, Employee employee) {
        employee.setGender(gender);
        FileEmployee.writeCSV(employeeList);
    }

    @Override
    public void editIDCard(IEmployeeService iEmployeeService, Employee employee) {
        employee.setIdentityCardNumber(iEmployeeService.toString());
        FileEmployee.writeCSV(employeeList);
    }

    @Override
    public void editNumberPhone(String numberPhone, Employee employee) {
        employee.setNumberPhone(numberPhone);
        FileEmployee.writeCSV(employeeList);
    }

    @Override
    public void editEmail(String email, Employee employee) {
        employee.setEmail(email);
        FileEmployee.writeCSV(employeeList);
    }

}
