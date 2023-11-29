package case_study.views;

import case_study.controller.EmployeeController;
import case_study.models.person.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    EmployeeController employeeController = new EmployeeController();
    private static int choice;
    private static Scanner scanner = new Scanner(System.in);

    private List<Employee> employeeList = new ArrayList<>();

    public void menuEmployee() {
        do {
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.Delete employee");
            System.out.println("5.Search by name employee");
            System.out.println("6.Return main employee");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeList = employeeController.findAll();
                    for (Employee employee : employeeList){
                        System.out.println(employee);
                    }
                case 2:
                    Employee employee = inputInfor();
                    employeeController.addEmployee(employee);
                    System.out.println("add success");
                    break;



            }
        }
        while (true);
    }

    private Employee inputInfor() {
        System.out.println("Input my full name");
        String fullName = scanner.nextLine();
        System.out.println("Input my birthday");
        String birthday = scanner.nextLine();
        System.out.println("Input gerder");
        String gender = scanner.nextLine();
        System.out.println("Input indentity card number");
        Long identityCardNumber = Long.valueOf(scanner.nextLine());
        System.out.println("Input numberPhone");
        Long numberPhone = Long.valueOf(scanner.nextLine());
        System.out.println("Input email");
        String email = scanner.nextLine();
        System.out.println("Input code staff");
        String codeStaff = scanner.nextLine();
        System.out.println("Input level");
        String level = scanner.nextLine();
        System.out.println("Input position");
        String position = scanner.nextLine();
        System.out.println("Input wage");
        Long wage = Long.valueOf(scanner.nextLine());
        return new Employee(fullName, birthday, gender, identityCardNumber, numberPhone, email, codeStaff, level, position, wage);
    }
}
