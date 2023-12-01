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

    public Employee checkCodeStaff(String code) {
       return iEmployeeService.checkByCode(code);
    }

    public void editFullName(String fullName, Employee employee) {
        iEmployeeService.editFullName(fullName,employee);
    }

    public void editBirthday(String birthday, Employee employee) {
        iEmployeeService.editBirthday(birthday,employee);
    }

    public void editGender(String gender, Employee employee) {
        iEmployeeService.editGender(gender,employee);
    }

    public void editIDCard(String identityCardNumber, Employee employee) {
        iEmployeeService.editIDCard(iEmployeeService,employee);
    }



    public void editNumberPhone(String numberPhone, Employee employee) {
        iEmployeeService.editNumberPhone(numberPhone,employee);
    }

    public void editEmail(String email, Employee employee) {
        iEmployeeService.editEmail(email,employee);
    }
}
