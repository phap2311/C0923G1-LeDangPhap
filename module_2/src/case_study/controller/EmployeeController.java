package case_study.controller;

import case_study.models.person.Employee;
import case_study.services.i_ser.IEmployeeService;
import case_study.services.ser.EmployeeService;

import java.util.List;

public class EmployeeController {
    IEmployeeService iEmployeeService = new EmployeeService();
    public void addEmployee(Employee employee) {
        iEmployeeService.save(employee);
    }

    public List<Employee> findAll() {
       return iEmployeeService.getAll();
    }
}
